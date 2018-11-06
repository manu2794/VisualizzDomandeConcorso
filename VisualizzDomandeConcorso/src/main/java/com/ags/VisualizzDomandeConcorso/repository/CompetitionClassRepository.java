package com.ags.VisualizzDomandeConcorso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ags.VisualizzDomandeConcorso.model.CompetitionClass;

public interface CompetitionClassRepository extends JpaRepository<CompetitionClass, Long> {
	
	public List<CompetitionClass> findAll();
	
	@Query(value = "SELECT *" + 
				   "FROM competclasses cc RIGHT JOIN qualifications_classes cs" + 
				   "ON cc.id = cs.qualifications_id" + 
				   "WHERE cs.qualifications_id = :qualId", nativeQuery = true)
	public List<CompetitionClass> findAllByQual(@Param("qualId") Long qualId);
}
