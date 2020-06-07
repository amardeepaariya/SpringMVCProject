package com.deep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deep.service.HelloWorldService;

@Controller
@RequestMapping(value = "/")
public class HelloworldController {
	
	@Autowired
	private HelloWorldService hellowoWorldService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcomePage","welcomeMessage",hellowoWorldService.welcomeMessge());
	}
	
	@RequestMapping(value = "welcomeagain", method = RequestMethod.GET)
	public ModelAndView welcomeagain() {
		return new ModelAndView("welcomePage","welcomeMessage",hellowoWorldService.welcomeAgainMessge());
	}

}
