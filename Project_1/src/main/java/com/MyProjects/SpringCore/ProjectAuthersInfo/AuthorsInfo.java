package com.MyProjects.SpringCore.ProjectAuthersInfo;

public class AuthorsInfo {

	private int autherId;
	private String autherName, autherAddress;

	public AuthorsInfo(int autherId, String autherName, String autherAddress) {
		this.autherId = autherId;
		this.autherName = autherName;
		this.autherAddress = autherAddress;
	}

	public int getAutherId() {
		return autherId;
	}

	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public String getAutherAddress() {
		return autherAddress;
	}

	public void setAutherAddress(String autherAddress) {
		this.autherAddress = autherAddress;
	}

}
