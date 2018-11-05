package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ags.VisualizzDomandeConcorso.model.DegreeEducation;
import com.ags.VisualizzDomandeConcorso.repository.QualificationRepository;
import com.ags.VisualizzDomandeConcorso.service.DegreeEducationService;
import com.ags.VisualizzDomandeConcorso.service.QualificationService;
import com.ags.VisualizzDomandeConcorso.view.bean.RequestBean;

@Controller
public class RequestController {
	
	@Autowired
	private DegreeEducationService eduService; 
	
	@Autowired
	private QualificationService qualService;
	
	 
	@GetMapping("/request")
	public String getEduList(@ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("requestBean", requestBean);
		model.addAttribute("educations", eduService.getEducations());
		return "requestForm";
	}
	
	@PostMapping("/request")
	public String getQualifList(@ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("qualificationsList", qualService.getQualificationsById(requestBean.getSelectedDegree()));
		return "qualifications";
	}
}
