package com.ags.VisualizzDomandeConcorso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ags.VisualizzDomandeConcorso.model.AppForm;

public interface AppFormRepository extends JpaRepository<AppForm, Long> {
	
//	@Query(value = "SELECT * FROM DegreeEducation de WHERE ", nativeQuery = true)
//	public 
	
}
