package com.ags.VisualizzDomandeConcorso.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.ags.VisualizzDomandeConcorso.repository.AppFormRepository;
import com.ags.VisualizzDomandeConcorso.service.AppFormService;

public class AppFormServiceImpl implements AppFormService {

	@Autowired
	private AppFormRepository appFormRepo;
}
