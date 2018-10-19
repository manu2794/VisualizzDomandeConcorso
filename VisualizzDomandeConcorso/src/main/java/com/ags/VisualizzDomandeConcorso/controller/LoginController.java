package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping(value = "/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String getSuccessLogin(Model model) {
		return "home";
	}
}
