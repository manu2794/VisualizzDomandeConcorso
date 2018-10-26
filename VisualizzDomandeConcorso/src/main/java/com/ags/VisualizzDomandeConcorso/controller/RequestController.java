package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestController {
	
	@GetMapping("/requestForm")
	public String getRequest() {
		return "requestForm";
	}
	
	@PostMapping(value = "/request")
	public String getSentRequest() {
		// incomplete
		return "sentRequest";
	}
	
	
}
