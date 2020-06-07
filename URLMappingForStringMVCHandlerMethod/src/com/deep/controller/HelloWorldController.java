package com.deep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcome", "welcomeMessage", "Hello World!!!");
	}

}
