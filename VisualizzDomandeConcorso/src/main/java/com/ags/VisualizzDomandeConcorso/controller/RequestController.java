package com.ags.VisualizzDomandeConcorso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;
import com.ags.VisualizzDomandeConcorso.model.DegreeEducation;
import com.ags.VisualizzDomandeConcorso.model.Qualification;
import com.ags.VisualizzDomandeConcorso.repository.QualificationRepository;
import com.ags.VisualizzDomandeConcorso.service.CompetitionClassService;
import com.ags.VisualizzDomandeConcorso.service.DegreeEducationService;
import com.ags.VisualizzDomandeConcorso.service.QualificationService;
import com.ags.VisualizzDomandeConcorso.view.bean.RequestBean;

@Controller
public class RequestController {
	
	@Autowired
	private DegreeEducationService eduService; 
	
	@Autowired
	private QualificationService qualService;
	
	@Autowired
	private CompetitionClassService compService;
	 
	@GetMapping("/request")
	public String getEduList(@ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("educations", eduService.getEducations());
		return "requestForm";
	}
	
	@PostMapping("/request")
	public String getQualifList(@RequestParam Long eduSelectedId, @ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("qualificationsList", qualService.getQualificationsByEdu(eduSelectedId));
		return "qualifications";
	}
	
	@PostMapping("/request/qualification")
	public String getCompClass(@RequestParam Long qualSelectedId, @ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("classList", compService.getClassesByQual(qualSelectedId));
		return "classes";
	}
	

}
