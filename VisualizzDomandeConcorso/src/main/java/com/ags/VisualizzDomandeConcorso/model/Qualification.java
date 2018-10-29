package com.ags.VisualizzDomandeConcorso.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "qualifications")
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(name = "qualcode")
	private String qualificCode;
	@NotEmpty
	@Column(name = "qualdenom")
	private String qualificDenom;
	@ManyToOne
	private DegreeEducation educationQual;
	@ManyToMany
	private Set<CompetitionClass> classes;
}
