package com.ags.VisualizzDomandeConcorso.model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
	@Size(max = 20)
	@NotEmpty
	private String username;
	@Size(max = 30)
	@NotEmpty
	private String password;
	@Size(max = 30)
	@Transient
	private String passwordConfirm;
	@NotEmpty
	private boolean enabled;
	
	@Size(max = 20)
	@NotEmpty
	@Column(name = "firstname")
	private String firstName;
	@Size(max = 20)
	@NotEmpty
	@Column(name = "lastname")
	private String lastName;
	@NotEmpty
	private String gender;
	@NotEmpty
	@Temporal(TemporalType.DATE)
	@Column(name = "birthdate")
	private Date birthDate;
	@Size(max = 20)
	@NotEmpty
	@Column(name = "origincity")
	private String originCity;
	@NotEmpty
	@Size(min = 16, max = 16)
	@Column(name = "fiscalcode")
	private String fiscalCode;
	
	@Size(max = 20)
	@NotEmpty
	private String province;
	@Size(max = 20)
	@NotEmpty
	private String municipality;
	@Size(max = 20)
	@NotEmpty
	private String street;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirtDhate() {
		return birthDate;
	}

	public void setBirthate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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
}
