package com.ags.VisualizzDomandeConcorso.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

