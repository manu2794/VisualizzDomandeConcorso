package com.ags.VisualizzDomandeConcorso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ags.VisualizzDomandeConcorso.model.Qualification;
import com.ags.VisualizzDomandeConcorso.repository.QualificationRepository;
import com.ags.VisualizzDomandeConcorso.service.QualificationService;

@Service
public class QualificationServiceImpl implements QualificationService {

	@Autowired
	private QualificationRepository qualRepo;
	
	@Override
	public List<Qualification> getQualifications() {
		return qualRepo.findAll();
	}
	
	@Override
	public List<Qualification> getQualificationsById(Long id) {
		return qualRepo.findAllById(id);
	}
	

}
