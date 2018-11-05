package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ags.VisualizzDomandeConcorso.model.Qualification;

public interface QualificationRepository extends JpaRepository<Qualification, Long> {
	
	public List<Qualification> findAll();
	
	@Query(value = "SELECT q FROM Qualification q WHERE q.educationQual = :qualId")
	public List<Qualification> findAllById(@Param("qualId") Long id);
	
}
