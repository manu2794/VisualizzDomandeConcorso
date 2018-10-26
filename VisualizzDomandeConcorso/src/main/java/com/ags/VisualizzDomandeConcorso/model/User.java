package com.ags.VisualizzDomandeConcorso.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	@NotEmpty
	@Column(name = "coduser", unique = true)
	private String codUser;
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
	@NotEmpty
	private boolean enabled;
	@NotEmpty
	@Size(min = 16, max = 16)
	@Column(name = "fiscalcode")
	private String fiscaCode;
	@NotEmpty
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;
	@OneToMany(mappedBy = "user")
	private List<AppForm> forms;		
	
	
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

	public String getCodUser() {
		return codUser;
	}

	public void setCodUser(String codUser) {
		this.codUser = codUser;
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

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getFiscaCode() {
		return fiscaCode;
	}

	public void setFiscaCode(String fiscaCode) {
		this.fiscaCode = fiscaCode;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<AppForm> getForms() {
		return forms;
	}

	public void setForms(List<AppForm> forms) {
		this.forms = forms;
	}

	public Long getId() {
		return id;
	}
}
