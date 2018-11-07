package com.ags.VisualizzDomandeConcorso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;
import com.ags.VisualizzDomandeConcorso.model.Qualification;
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
	 
	@GetMapping("/educations")
	public String getEduList(@ModelAttribute RequestBean requestBean, Model model) {
		model.addAttribute("educations", eduService.getEducations());
		return "requestForm";
	}
	
	@GetMapping("/educations/qualifications")
	public @ResponseBody List<Qualification> getQualifications(@RequestParam(value = "eduSelectedId", required = true) Long eduSelectedId, @ModelAttribute RequestBean requestBean) {
		requestBean.setEduSelectedId(eduSelectedId);
		return qualService.getQualificationsByEdu(eduSelectedId);
	}
	
	@GetMapping("/educations/qualifications/classes")
	public @ResponseBody List<CompetitionClass> getClasses(@RequestParam(value = "qualSelectedId", required = true) Long qualSelectedId, @ModelAttribute RequestBean requestBean) {
		requestBean.setQualSelectedId(qualSelectedId);
		return compService.getClassesByQual(qualSelectedId);
	}
}