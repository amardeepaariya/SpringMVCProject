package com.deep.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
	
	@RequestMapping(value = "/")
	public String welcomePage() {
		return "welcomePage";
	}
	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("welcomeMessage", "Welcome to www.adkaec.net");
		model.addAttribute("headerMessage", "welcome to adkaec");
	}
	
//	@RequestMapping(value = "/")
//	public String welcomePage(Map<String,Object> map) {
//		map.put("welcomeMessage", "Welcome to www.adkaec.net");
//		map.put("headerMessage", "welcome to adkaec");
//		return "welcomePage";
//	}
	
//	@RequestMapping(value = "/")
//	public String welcomePage(Model model) {
//		model.addAttribute("welcomeMessage", "Welcome to www.adkaec.net");
//		model.addAttribute("headerMessage", "welcome to adkaec");
//		return "welcomePage";
//	}

}
