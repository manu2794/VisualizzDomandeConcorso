package com.ags.VisualizzDomandeConcorso.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity(name = "classes")
public class CompetitionClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(name = "codclc")
	private String codClc;
	@NotEmpty
	@Column(name = "denomclc")
	private String denomClc;
	@ManyToMany(mappedBy = "classes")
	private Set<Qualification> qualifications;
}
