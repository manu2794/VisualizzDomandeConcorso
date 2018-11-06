package com.ags.VisualizzDomandeConcorso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;
import com.ags.VisualizzDomandeConcorso.repository.CompetitionClassRepository;
import com.ags.VisualizzDomandeConcorso.service.CompetitionClassService;

@Service
public class CompetitionClassServiceImpl implements CompetitionClassService {

	@Autowired
	private CompetitionClassRepository compRepo;
	
	@Override
	public List<CompetitionClass> getClasses() {
		return compRepo.findAll();
	}

	@Override
	public List<CompetitionClass> getClassesByQual(Long qualId) {
		return compRepo.findAllByQual(qualId);
	}
}
