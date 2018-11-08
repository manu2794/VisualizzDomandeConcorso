package com.ags.VisualizzDomandeConcorso.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "educations")
@NamedQuery(name = "DegreeEducation.findAll", query = "SELECT ds FROM DegreeEducation ds")
public class DegreeEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long eduId;
	@NotEmpty
	@Column(name = "denom")
	private String eduDenom;
	@OneToMany(mappedBy = "educationQual")
	private Set<Qualification> qualifications;
	@OneToMany(mappedBy = "educationForm")

	public String getDenom() {
		return eduDenom;
	}
	
	public void setDenom(String descr) {
		this.eduDenom = descr;
	}
	
	public Set<Qualification> getQualifications() {
		return qualifications;
	}
	
	public void setQualifications(Set<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	
	public Long getId() {
		return eduId;
	}
}