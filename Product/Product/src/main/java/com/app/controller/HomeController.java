package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("in ctor of "+getClass());
	}

	@GetMapping("/home")
	public String showHomePage()
	{
		System.out.println("in show home page");
		return "/product";
	}
	
}
