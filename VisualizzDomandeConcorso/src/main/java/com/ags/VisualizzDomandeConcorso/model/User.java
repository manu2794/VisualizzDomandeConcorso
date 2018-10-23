package com.ags.VisualizzDomandeConcorso.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Size(max = 20)
	@NotEmpty
	private String name;
	@Size(max = 20)
	@NotEmpty
	private String surname;
	@Size(max = 20)
	@NotEmpty
	@Column(name = "username")
	private String username;
	@Size(max = 30)
	@NotEmpty
	private String password;
	@Size(max = 30)
	@Transient
	private String passwordConfirm;
	private boolean enabled;
	@NotEmpty
	@ManyToOne
	@JoinColumn(name = "rolename")
	private Role role;
//	@NotEmpty
//	@ManyToMany(mappedBy = "users")
//	private List<CompetitionClass> classes;		
	
	
	public User() {
		
	}
	
	public User(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;	
	}

	public User(String username, String password, boolean enabled, Role role) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.role = role;
	}
	
	
	public Long getId() {
		return userId;
	}
	
	public void setId(Long id) {
		this.userId = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String email) {
		this.username = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

//	public List<CompetitionClass> getClasses() {
//		return classes;
//	}
//
//	public void setClasses(List<CompetitionClass> classes) {
//		this.classes = classes;
//	}
}
