package com.jun.blocks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jun.blocks.sample.Sample;
import com.jun.blocks.sample.dao.SampleDao;

@Controller
@RequestMapping(value="/sample")
public class SampleController {
	
	private static Logger logger = LoggerFactory.getLogger(SampleController.class);

	@Autowired
	private SampleDao sampleDao;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		logger.info("sample home");
		
		return "sample/index";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addSample(Sample sample, Model model) {
		logger.info("add sample");
		
		int result = sampleDao.add(sample);
		
		if (result == 1) {
			model.addAttribute("resultMessage", "추가 성공");
		} else {
			model.addAttribute("resultMessage", "추가 실패");
		}
		
		return "sample/index";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteSample(int sequence, Model model) {
		logger.info("delete sample: " + sequence);
		
		int result = sampleDao.delete(sequence);
		
		if (result == 1) {
			model.addAttribute("resultMessage", "삭제 성공");
		} else {
			model.addAttribute("resultMessage", "삭제 실패");
		}
		
		return "sample/index";
	}
}
