package com.deep.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloWorldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("main", "message", "Welcome AMARDEEP to Spring MVC World !!");
	}

}
