package com.capgemini.uas.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UsersBean {

	//Variable Declaration
	@Id
	private String loginId;
	private String password;
	private String role;
	
	//Getters and Setters Methods
	@Column(name="login_id")
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="role")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	//toString() Method Overriden
	@Override
	public String toString() {
		return "Users\nLogin Id = " + loginId + "\nPassword = " + password
				+ "\nRole = " + role + "]";
	}
	
	// Parameterized Constructor
	public UsersBean(String loginId, String password, String role) {
		
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}
	
	// Default Constructor
	public UsersBean() {

	}	
}