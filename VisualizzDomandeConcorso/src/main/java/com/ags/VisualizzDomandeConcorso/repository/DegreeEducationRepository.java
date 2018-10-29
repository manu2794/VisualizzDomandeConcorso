package com.ags.VisualizzDomandeConcorso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ags.VisualizzDomandeConcorso.model.DegreeEducation;

public interface DegreeEducationRepository extends JpaRepository<DegreeEducation, Long>{
	
//	@Query(value = "SELECT f.denom FROM forms WHERE ")
}
