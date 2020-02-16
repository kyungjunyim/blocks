package com.jun.blocks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
