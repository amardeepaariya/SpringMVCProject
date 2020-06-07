package com.deep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deep.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "/listUsers")
	public ModelAndView listUsers() {
		return new ModelAndView("listUsers", "listUsersMessage","List of users returned.");
	}
	
	@RequestMapping(value = "/saveUser")
	public ModelAndView saveUser(User user) {
		return new ModelAndView("saveUser", "saveUserMessage","User Data is saved.");
	}
	
	@RequestMapping(value = "/deleteUser")
	public ModelAndView deleteUser(User user) {
		return new ModelAndView("deleteUser", "deleteUserMessage","User Data is deleted.");
	}
	
}
