package com.ags.VisualizzDomandeConcorso.service;

import java.util.List;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;

public interface CompetitionClassService {
	
	public List<CompetitionClass> getClasses();
	
	public List<CompetitionClass> getClassesByQual(Long qualId);
}
