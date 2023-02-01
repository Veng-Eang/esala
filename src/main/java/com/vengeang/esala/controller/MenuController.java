package com.vengeang.esala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/browse")
	public String browse() {
		return "browse";
	}
	@GetMapping("/streams")
	public String streams() {
		return "streams";
	}
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	@GetMapping("/details")
	public String details() {
		return "details";
	}
}
