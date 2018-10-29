package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;

public interface CompetitionClassRepository extends JpaRepository<CompetitionClass, Long> {
	
	public List<CompetitionClass> findAll();

}
