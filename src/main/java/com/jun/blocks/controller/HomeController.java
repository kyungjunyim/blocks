package com.jun.blocks.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jun.blocks.auth.GoogleLogin;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		logger.info("Home");
		
		return "home/index";
	}
	@RequestMapping(value="/blocks", method=RequestMethod.GET)
	public String main() {
		logger.info("Main");
		
		return "home/main";
	}
	@RequestMapping(value="test/google/login", method=RequestMethod.GET)
	public void test(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.doGet(req, res);
	}
}
