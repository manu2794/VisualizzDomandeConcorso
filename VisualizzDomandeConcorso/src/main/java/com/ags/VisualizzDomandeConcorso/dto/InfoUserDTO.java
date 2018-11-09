package com.ags.VisualizzDomandeConcorso.dto;

import java.io.Serializable;

public class InfoUserDTO implements Serializable {
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String birthDate;
	private String originCity;
	private String fiscalCode;
	private String province;
	private String municipality;
	private String street;
	
	public InfoUserDTO() {
	}
	
	public InfoUserDTO(InfoUserDTO infoUser) {
		if(infoUser != null) {
			this.firstName = infoUser.getFirstName();
			this.lastName = infoUser.getLastName();
			this.gender = infoUser.getGender();
			this.age = infoUser.getAge();
			this.birthDate = infoUser.getBirthDate();
			this.originCity = infoUser.getOriginCity();
			this.fiscalCode = infoUser.getFiscalCode();
			this.province = infoUser.getProvince();
			this.municipality = infoUser.getMunicipality();
			this.street = infoUser.getStreet();
		}
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
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
}

