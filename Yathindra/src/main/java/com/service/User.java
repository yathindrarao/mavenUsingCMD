package com.service;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(appliesTo = "user")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_name")
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "password",nullable = false)
	private String password;
	
	public User(String userName,String password)
	{
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
	}
   
}
