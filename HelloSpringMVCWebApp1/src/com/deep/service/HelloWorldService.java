package com.deep.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String welcomeMessge() {
		return "welcome AMARDEEP to Spring MVC world !!!";
	}

	public Object welcomeAgainMessge() {
		// TODO Auto-generated method stub
		return "welcome Again AMARDEEP to Spring MVC world !!!";
	}

}
