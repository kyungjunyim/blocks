package com.jun.blocks.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.jun.blocks.model.BlocksFile;

@Controller
@RequestMapping(value="/google")
public class GoogleTestController {
	private static Logger logger = LoggerFactory.getLogger(GoogleTestController.class);
	
	private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
	private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	private static NetHttpTransport HTTP_TRANSPORT;
	private static final List<String> SCOPES = Arrays.asList(DriveScopes.DRIVE_METADATA_READONLY, DriveScopes.DRIVE_METADATA);
	
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String home(HttpServletRequest req, HttpServletResponse res) throws GeneralSecurityException, IOException {
		logger.info("google");
		
		HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		
		// Google Credential 받는 과정
		Credential credential = getCredential(HTTP_TRANSPORT);
		
		
		// Drive API 사용하기 위한 객체 Build
		Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
				.setApplicationName("Blocks")
				.build();
		
		List<File> files = new ArrayList<File>();
		
		String pageToken = null;
		do {
			FileList result = service.files().list()
					.setSpaces("drive")
					.setFields("nextPageToken, files(id, name)")
					.setPageToken(pageToken)
					.execute();
			
			for(File file : result.getFiles()) {
				files.add(file);
			}
			
			pageToken = result.getNextPageToken();
		} while(pageToken != null);
		
		
		req.setAttribute("files", files);
		
		return "test/google_login";
	}
	
	private Credential getCredential(NetHttpTransport HTTP_TRANSPORT) throws IOException {
		// credentials.json 읽어들임
		InputStream in = GoogleTestController.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
		
		// clientSercret 생성
		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
		
		// scope를 정해서 auth key 생성
		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
				.setAccessType("online")
				.build();
		
		 LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
		 
		return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
	}
}
