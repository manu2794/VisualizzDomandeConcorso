package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;

public interface CompetitionClassRepository extends JpaRepository<CompetitionClass, Long> {
	
	public List<CompetitionClass> findAll();
	
	@Query(value = "SELECT *" + 
				   "FROM competclasses cc JOIN qualifications_classes qc " + 
				   "ON qc.classes_id = cc.id " + 
				   "WHERE qc.qualifications_id = :qualId", nativeQuery = true)
	public List<CompetitionClass> findAllByQual(@Param("qualId") Long qualId);
	
}