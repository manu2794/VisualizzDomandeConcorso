package com.ags.VisualizzDomandeConcorso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "forms")
public class AppForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(name = "formcode")
	private String formCode;
	@NotEmpty
	private Status status;
	@NotEmpty
	@ManyToOne
	private User user;
	
	
	
}