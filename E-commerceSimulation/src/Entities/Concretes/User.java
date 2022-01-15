package Entities.Concretes;

import Entities.Abstracts.Entity;

public class User implements Entity{
	
	private String firtsName;
	private String lastName;
	private String email;
	private String password;
	
	
	public User(String firtsName, String lastName, String email, String password) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}


	public String getFirtsName() {
		return firtsName;
	}


	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
