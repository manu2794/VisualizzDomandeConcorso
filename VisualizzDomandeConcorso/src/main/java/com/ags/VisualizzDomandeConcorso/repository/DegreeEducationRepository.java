package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ags.VisualizzDomandeConcorso.model.DegreeEducation;

public interface DegreeEducationRepository extends JpaRepository<DegreeEducation, Long> {
	
	public List<DegreeEducation> findAll();
	
	

}
