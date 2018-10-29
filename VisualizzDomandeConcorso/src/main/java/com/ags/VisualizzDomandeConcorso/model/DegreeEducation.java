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

@Entity
@Table(name = "educations")
@NamedQuery(name = "DegreeEducation.findAll", query = "SELECT ds FROM DegreeEducation ds")
public class DegreeEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(name = "denom")
	private String denom;
	@OneToMany(mappedBy = "educationQual")
	private Set<Qualification> qualifications;
	@OneToMany(mappedBy = "educationForm")

	public String getDenom() {
		return denom;
	}
	
	public void setDenom(String descr) {
		this.denom = descr;
	}
	
	public Set<Qualification> getQualifications() {
		return qualifications;
	}
	
	public void setQualifications(Set<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	
	public Long getId() {
		return id;
	}
}