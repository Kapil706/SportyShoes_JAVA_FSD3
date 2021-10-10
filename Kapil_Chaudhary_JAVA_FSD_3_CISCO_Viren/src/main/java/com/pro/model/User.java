package com.pro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "userID")
	private int userID;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private int password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="phone_number")
	private int phone_number;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}



	
	
	
}
