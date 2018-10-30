package com.ags.VisualizzDomandeConcorso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.model.DegreeEducation;
import com.ags.VisualizzDomandeConcorso.repository.DegreeEducationRepository;
import com.ags.VisualizzDomandeConcorso.service.DegreeEducationService;

@Service
public class DegreeEducationServiceImpl implements DegreeEducationService {

	@Autowired
	private DegreeEducationRepository eduRepo;
	
	@Override
	public List<DegreeEducation> getEducations() {
		return eduRepo.findAll();
	}
}
