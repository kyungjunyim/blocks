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

	private GoogleAuthorizationCodeFlow flow;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("google login");

		String state = new BigInteger(130, new SecureRandom()).toString(32); // prevent request forgery
		req.getSession().setAttribute("state", state);

		if (req.getAttribute("loginDestination") != null) {
			req.getSession().setAttribute("loginDestination", (String) req.getAttribute("loginDestination"));
		} else {
			req.getSession().setAttribute("loginDestination", "/test/google");
		}

		String clientId = getServletContext().getInitParameter("blocks.clientId");
		String clientSecret = getServletContext().getInitParameter("blocks.clientSecret");
		String redirectUri = getServletContext().getInitParameter("callback.host");

		// flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientId, clientSecret, SCOPES).build();

		// String url = flow.newAuthorizationUrl().setRedirectUri(redirectUri).setState(state).build();

	}
}
