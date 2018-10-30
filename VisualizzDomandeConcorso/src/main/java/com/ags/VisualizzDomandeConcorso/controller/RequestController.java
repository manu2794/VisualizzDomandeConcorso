package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ags.VisualizzDomandeConcorso.service.DegreeEducationService;

@Controller
public class RequestController {
	
	private DegreeEducationService eduService; 
	
	@Autowired
	public RequestController(DegreeEducationService degreeEducationService) {
		this.eduService = degreeEducationService;
	}
	
	@GetMapping("/request")
	public String getRequest(Model model) {
		model.addAttribute("educations", eduService.getEducations());
		return "requestForm";
	}
	
//	@GetMapping("/request/edu")
//	public String educationsList(Model model) {
//		model.addAttribute("educations", eduService.getEducations());
//		return "requestForm";
//	}
	
//	@PostMapping(value = "/request")
//	public String getSentRequest(@ModelAttribute AppForm appForm, Model model) {
//		// incomplete
//		return "sentRequest";
//	}
	
	
}
