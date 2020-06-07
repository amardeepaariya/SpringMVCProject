package com.deep.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
@RequestMapping(value = "/")
public class HelloworldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) 
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("welcomePage", "helloMessage", "Hello ,"+req.getParameter("userName"));
	}
	
	

}
