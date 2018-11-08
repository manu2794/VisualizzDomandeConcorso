package com.ags.VisualizzDomandeConcorso.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "qualifications")
@NamedQuery(name = "Qualification.findAll", query = "SELECT q FROM Qualification q")
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
	@JsonBackReference
	@ManyToOne
	private DegreeEducation educationQual;
	@JsonBackReference
	@ManyToMany
	private Set<CompetitionClass> classes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQualificCode() {
		return qualificCode;
	}
	public void setQualificCode(String qualificCode) {
		this.qualificCode = qualificCode;
	}
	public String getQualificDenom() {
		return qualificDenom;
	}
	public void setQualificDenom(String qualificDenom) {
		this.qualificDenom = qualificDenom;
	}
	public DegreeEducation getEducationQual() {
		return educationQual;
	}
	public void setEducationQual(DegreeEducation educationQual) {
		this.educationQual = educationQual;
	}
	public Set<CompetitionClass> getClasses() {
		return classes;
	}
	public void setClasses(Set<CompetitionClass> classes) {
		this.classes = classes;
	}
}
