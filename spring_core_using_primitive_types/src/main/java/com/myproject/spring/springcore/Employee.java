package com.myproject.spring.springcore;

public class Employee {

	private int id;
	private String name;
	private String emailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

// Employee bean is ready
// next we will create the spring configuration
// where we will define our bean and inject these dependencies