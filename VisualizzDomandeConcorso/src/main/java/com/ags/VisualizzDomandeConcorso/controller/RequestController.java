package com.ags.VisualizzDomandeConcorso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;
import com.ags.VisualizzDomandeConcorso.model.Qualification;
import com.ags.VisualizzDomandeConcorso.service.CompetitionClassService;
import com.ags.VisualizzDomandeConcorso.service.DegreeEducationService;
import com.ags.VisualizzDomandeConcorso.service.QualificationService;
import com.ags.VisualizzDomandeConcorso.view.bean.RequestBean;

@Controller
@SessionAttributes("requestBean")
public class RequestController {
	
	@Autowired
	private DegreeEducationService eduService; 
	
	@Autowired
	private QualificationService qualService;
	
	@Autowired
	private CompetitionClassService compService;
	 
	
	@ModelAttribute("requestBean")
	    public RequestBean requestBean() {
	        return new RequestBean();
	}
	
	@GetMapping("/educations")
	public String getEduList(@ModelAttribute("requestBean") RequestBean requestBean, Model model) {
		model.addAttribute("educations", eduService.getEducations());
		return "requestForm";
	}
	
	@GetMapping("/educations/qualifications")
	public @ResponseBody List<Qualification> getQualifications(@RequestParam(value = "eduSelectedId", required = true) Long eduSelectedId, @ModelAttribute("requestBean") RequestBean requestBean) {
		requestBean.setEduSelectedId(eduSelectedId);
		return qualService.getQualificationsByEdu(eduSelectedId);
	}
	
	@GetMapping("/educations/qualifications/classes")
	public @ResponseBody List<CompetitionClass> getClasses(@RequestParam(value = "qualSelectedId", required = true) Long qualSelectedId, @ModelAttribute("requestBean") RequestBean requestBean) {
		requestBean.setQualSelectedId(qualSelectedId);
		return compService.getClassesByQual(qualSelectedId);
	}
	
	@GetMapping("/request")
	public String getClassSelected(@RequestParam(value = "classSelectedId", required = true) Long classSelectedId, Model model, @ModelAttribute("requestBean") RequestBean requestBean) {
		requestBean.setClassSelectedId(classSelectedId);
		model.addAttribute("eduSelectedId", requestBean.getEduSelectedId());
		model.addAttribute("qualSelectedId", requestBean.getQualSelectedId());
		model.addAttribute("classSelectedId", requestBean.getClassSelectedId());
		return "sentRequest";
	}
}