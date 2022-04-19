package com.myproject.spring.springcore.RefTypes;

public class StudentInfos {

	private String name, emailId;

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

	public String toString() {
		return "StudentInfos [ name = " + name + ", emailId = " + emailId + " ]";
	}

}
