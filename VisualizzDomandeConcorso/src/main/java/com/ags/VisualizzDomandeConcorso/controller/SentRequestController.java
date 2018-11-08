package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.ags.VisualizzDomandeConcorso.view.bean.RequestBean;

@Controller
public class SentRequestController {
	
//	@Autowired
//	private AppFormService formService;
	
	@GetMapping("/insert")
	public ModelAndView getQuestionEntry(@ModelAttribute("requestBean") RequestBean requestBean) {
		requestBean.setOk("Funzionaaa");
		ModelAndView mav = new ModelAndView("sentRequest");
		mav.addObject("ok", requestBean.getOk());
		return mav;
	}
}
