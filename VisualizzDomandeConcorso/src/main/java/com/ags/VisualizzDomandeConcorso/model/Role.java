package com.ags.VisualizzDomandeConcorso.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", unique = true, nullable = false)
	private Integer roleId;
	@OneToMany(mappedBy = "role")
	@Column(name = "users", nullable = false)
	private List<User> users;
	@Column(name = "role", length = 20)
	@NotEmpty
	private String role;
	
	
	public Role(String role) {
		this.role = role;
	}
	
//	public Role(List<User> users, String role) {
//		this.users = users;
//		this.role = role;
//	}
	
	
	public Integer getUserRoleId() {
		return this.roleId;
	}
	
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	public List<User> getUsers() {
		return this.users;	
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}  