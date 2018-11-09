package com.ags.VisualizzDomandeConcorso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ags.VisualizzDomandeConcorso.dto.InfoUserDTO;
import com.ags.VisualizzDomandeConcorso.model.User;
import com.ags.VisualizzDomandeConcorso.service.UserService;

/* Anagrafica*/

@Controller
public class RegistryController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/registry")
	public String registerPage() {
		return "registry";
	}
	
	@PostMapping("/registry")
	public String registerPersonalInfo(@ModelAttribute("infoUser") InfoUserDTO infoUser, Model model) {
		User user = new User();
		user.setFirstName(infoUser.getFirstName());
		user.setLastName(infoUser.getLastName());
		user.setGender(infoUser.getGender());
		user.setOriginCity(infoUser.getOriginCity());
		user.setFiscalCode(infoUser.getFiscalCode());
		user.setProvince(infoUser.getProvince());
		user.setMunicipality(infoUser.getMunicipality());
		user.setStreet(infoUser.getStreet());
		
		userService.update(user);
		model.addAttribute("user", user);
		return "requestForm";
	}
}
