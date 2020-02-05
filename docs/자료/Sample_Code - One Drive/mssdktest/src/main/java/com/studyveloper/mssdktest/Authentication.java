package com.studyveloper.mssdktest;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.microsoft.aad.msal4j.DeviceCode;
import com.microsoft.aad.msal4j.DeviceCodeFlowParameters;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.PublicClientApplication;

public class Authentication {
	 private static String applicationId;
	    // Set authority to allow only organizational accounts
	    // Device code flow only supports organizational accounts
	    private final static String authority = "https://login.microsoftonline.com/common/";

	    public static void initialize(String applicationId) {
	        Authentication.applicationId = applicationId;
	    }

	    public static String getUserAccessToken(String[] scopes) {
	        if (applicationId == null) {
	            System.out.println("You must initialize Authentication before calling getUserAccessToken");
	            return null;
	        }
	        
	        Set<String> scopeSet = new HashSet<String>();
	        for (String str : scopes) {
	        	scopeSet.add(str);
	        }

	        PublicClientApplication app;
	        try {
	            // Build the MSAL application object with
	            // app ID and authority
	            app = PublicClientApplication.builder(applicationId)
	                .authority(authority)
	                .build();
	        } catch (MalformedURLException e) {
	            return null;
	        }

	        // Create consumer to receive the DeviceCode object
	        // This method gets executed during the flow and provides
	        // the URL the user logs into and the device code to enter
	        Consumer<DeviceCode> deviceCodeConsumer = new Consumer<DeviceCode>() {
				public void accept(DeviceCode deviceCode) {
					// TODO Auto-generated method stub
					System.out.println(deviceCode.message());
				}
			};
	        

	        // Request a token, passing the requested permission scopes
	        IAuthenticationResult result = app.acquireToken(
	            DeviceCodeFlowParameters
	                .builder(scopeSet, deviceCodeConsumer)
	                .build()
	        ).exceptionally(ex -> {
	            System.out.println("Unable to authenticate - " + ex.getMessage());
	            return null;
	        }).join();

	        if (result != null) {
	            return result.accessToken();
	        }

	        return null;
	    }
}
