package com.ags.VisualizzDomandeConcorso.service;

import java.util.List;

import com.ags.VisualizzDomandeConcorso.model.Qualification;

public interface QualificationService {
	
	public List<Qualification> getQualifications();
	
	public List<Qualification> getQualificationsById(Long id);
}
 