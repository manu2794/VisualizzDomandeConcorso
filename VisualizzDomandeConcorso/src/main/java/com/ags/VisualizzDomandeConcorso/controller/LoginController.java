package com.ags.VisualizzDomandeConcorso.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping(value = { "/", "/login" })
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping(value = "/admin")
	public String getAdminPage() {
		return "admin";
	}
	
	@GetMapping(value = "/user")
	public String getUserPage() {
		return "user";
	}
}

