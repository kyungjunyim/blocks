package com.jun.blocks.auth;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public class GoogleLogin extends HttpServlet {
	private static final Collection<String> SCOPES = Arrays.asList("email", "profile");
	private static final JsonFactory JSON_FACTORY = new JacksonFactory();
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	private static final String CLIENT_ID = "528170858216-skss4v65ehim2r8e9hmkjl60hq5j25u8.apps.googleusercontent.com";
	private static final String CLIENT_SECRET = "goZqLjq8oPh97_A54hSU0lYr";
	private static final String REDIRECT_URI = "localhost:8080";

	private GoogleAuthorizationCodeFlow flow;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// google login test
		System.out.println("google login");

		String state = new BigInteger(130, new SecureRandom()).toString(32); // prevent request forgery
		req.getSession().setAttribute("state", state);

		if (req.getAttribute("loginDestination") != null) {
			req.getSession().setAttribute("loginDestination", (String) req.getAttribute("loginDestination"));
		} else {
			req.getSession().setAttribute("loginDestination", "/test/google");
		}

		flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, CLIENT_ID, CLIENT_SECRET, SCOPES).build();

		String url = flow.newAuthorizationUrl().setRedirectUri(REDIRECT_URI).setState(state).build();

		System.out.println(url);
	}
}
