package com.deep.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class User {
	
	@NotEmpty(message = "Name can't be empty")
	private String name;
	
	@Min(value = 16, message = "Age can't be less than 16")
	@Max(value = 60, message = "Age can't be greater than 60")
	@NotNull(message = "Age can't be Null")
	private Integer age;
	
	@NotEmpty(message = "email can't be empty")
	@Email(message = "Enter valid email")
	private String email;
	
	@NotEmpty(message = "country can't be empty")
	private String country;
	
	
	public User(String name, Integer age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
