package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ags.VisualizzDomandeConcorso.model.Qualification;

public interface QualificationRepository extends JpaRepository<Qualification, Long> {
	
	public List<Qualification> findAll();
	
}
