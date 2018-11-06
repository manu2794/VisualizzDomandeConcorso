package com.ags.VisualizzDomandeConcorso.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "competclasses")
@NamedQuery(name = "CompetitionClass.findAll", query = "SELECT cc FROM CompetitionClass cc")
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodClc() {
		return codClc;
	}
	public void setCodClc(String codClc) {
		this.codClc = codClc;
	}
	public String getDenomClc() {
		return denomClc;
	}
	public void setDenomClc(String denomClc) {
		this.denomClc = denomClc;
	}
	public Set<Qualification> getQualifications() {
		return qualifications;
	}
	public void setQualifications(Set<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
}
