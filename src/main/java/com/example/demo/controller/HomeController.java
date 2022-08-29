package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "welcome";
	}
	//end point for login api 
	@GetMapping("/")
	public String loginUser() {
		return "login.html";
	}
}
