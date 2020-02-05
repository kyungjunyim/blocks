package com.jun.blocks.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxSessionStore;
import com.dropbox.core.DbxStandardSessionStore;
import com.dropbox.core.DbxWebAuth;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.DbxUserFilesRequests;
import com.dropbox.core.v2.files.DownloadBuilder;
import com.dropbox.core.v2.files.FolderMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.files.UploadUploader;

@Controller
@RequestMapping(value = "/DBapi")
public class DbxTestController {
	private static final String APP_KEY = "e3acnplr67xrrk3";
	private static final String APP_SEC = "bet740jykjafxtz";
	private static final String CSRF_TOKEN = "csrf-token";
	private static final String REDIRECT_URI = "http://localhost:8080/DBapi/redirect";
	private static final DbxRequestConfig CONFIG = new DbxRequestConfig("Blocks/1.0");

	private DbxWebAuth getDbxWebAuth() {
		DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SEC);
		return new DbxWebAuth(CONFIG, appInfo);
	}

	private List<String> getFolder(String accessToken, String path) {
		DbxClientV2 client = new DbxClientV2(CONFIG, accessToken);
		DbxUserFilesRequests fileRequest = client.files();

		List<String> folderList = new ArrayList<String>();

		try {
			ListFolderResult result = fileRequest.listFolder(path);

			while (true) {
				for (Metadata metadata : result.getEntries()) {
					if (metadata instanceof FolderMetadata) {
						folderList.add(metadata.getPathLower());

						folderList.addAll(getFolder(accessToken, metadata.getPathLower()));
					}
				}

				if (!result.getHasMore()) {
					break;
				}

				result = client.files().listFolderContinue(result.getCursor());
			}
		} catch (Exception e) {
			// 예외처리
			e.printStackTrace();
		}
		return folderList;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		String accessToken = (String) session.getAttribute("accessToken");
		DbxWebAuth webAuth = getDbxWebAuth();
		DbxSessionStore csrfTokenStore = new DbxStandardSessionStore(session, CSRF_TOKEN);

		if (accessToken == null) {
			DbxWebAuth.Request authRequest = DbxWebAuth.newRequestBuilder()
					.withRedirectUri(REDIRECT_URI, csrfTokenStore).build();
			String authorizePageUrl = webAuth.authorize(authRequest);
			System.out.println(authorizePageUrl);
			request.setAttribute("url", authorizePageUrl);
			return "DBapi/home";
		} else {
			return "DBapi/main";
		}
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		DbxWebAuth webAuth = getDbxWebAuth();
		DbxSessionStore csrfTokenStore = new DbxStandardSessionStore(session, CSRF_TOKEN);

		DbxAuthFinish authFinish;
		try {
			authFinish = webAuth.finishFromRedirect(REDIRECT_URI, csrfTokenStore, request.getParameterMap());
			String accessToken = authFinish.getAccessToken();
			session.setAttribute("accessToken", accessToken);
		} catch (Exception e) {
			// 예외처리..
			e.printStackTrace();
		}
		return "DBapi/main";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		String accessToken = (String) session.getAttribute("accessToken");

		if (accessToken == null) {
			return "DBapi/home";
		}

		DbxClientV2 client = new DbxClientV2(CONFIG, accessToken);
		DbxUserFilesRequests fileRequest = client.files();
		try {
			ListFolderResult result = fileRequest.listFolder("");
			List<String> fileList = new ArrayList<String>();
			while (true) {
				for (Metadata metadata : result.getEntries()) {
					fileList.add(metadata.getPathLower());
				}

				if (!result.getHasMore()) {
					break;
				}
				result = client.files().listFolderContinue(result.getCursor());

			}
			request.setAttribute("list", fileList);
		} catch (Exception e) {
			// 예외처리
			e.printStackTrace();
		}
		return "DBapi/list";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String upload(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String accessToken = (String) session.getAttribute("accessToken");

		if (accessToken == null) {
			return "DBapi/home";
		}
		List<String> res = getFolder(accessToken, "");
		request.setAttribute("folderList", res);

		return "DBapi/upload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String uploadFile(HttpServletRequest request, MultipartFile file) {
		HttpSession session = request.getSession(true);
		String accessToken = (String) session.getAttribute("accessToken");
		if (accessToken == null) {
			return "DBapi/home";
		}

		DbxClientV2 client = new DbxClientV2(CONFIG, accessToken);
		DbxUserFilesRequests fileRequest = client.files();
		String path = request.getParameter("path");
		String filename = request.getParameter("filename");
		InputStream in;
		try {
			in = file.getInputStream();
			UploadUploader uploader = fileRequest.upload(path+"/"+filename);
			uploader.uploadAndFinish(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DBapi/main";
	}
	
	@RequestMapping(value = "download", method=RequestMethod.GET)
	public String download(HttpServletRequest request) {
		return "DBapi/download";
	}
	@RequestMapping(value = "download", method=RequestMethod.POST)
	public void downloadFile(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		String accessToken = (String) session.getAttribute("accessToken");
		if (accessToken == null) {
			//return "DBapi/home";
		}

		DbxClientV2 client = new DbxClientV2(CONFIG, accessToken);
		DbxUserFilesRequests fileRequest = client.files();
		String path = request.getParameter("filename");
		
		DownloadBuilder db = fileRequest.downloadBuilder(path);
		try {
			OutputStream out = response.getOutputStream();
			db.download(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
