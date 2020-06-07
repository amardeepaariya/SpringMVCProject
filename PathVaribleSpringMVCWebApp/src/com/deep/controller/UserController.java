package com.deep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/users")
public class UserController {
	
	@RequestMapping(value = "/user/{userName}/{age}", method = RequestMethod.GET)
	public ModelAndView greet(@PathVariable("userName") String userName, @PathVariable("age")     
	int age,@RequestParam("country") String country) {           // calling throng ---> PathVaribleSpringMVCWebApp/users/user/amardeep/25?country=india
		return new ModelAndView("welcomePage", "welcomeMessage", "Hello "+userName+
				" You are "+age+" years old."+" You are from "+country);
		
	}

}
