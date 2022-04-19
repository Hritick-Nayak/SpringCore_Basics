package com.MyProjects.SpringCore.LifeCycle.XmlConfig.ImplementingLifeCycleMethodsUsingXmlConfiguration;

public class Patient {

	private int id;

	public int getId() {
		System.out.println("Inside getId Method");
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setId Method");
		this.id = id;
	}

	public void hi() { // inIt method
		System.out.println("Inside hi Method");
	}

	public void bye() { // distroy method
		System.out.println("Inside bye Method");
	}

	public String toString() {
		// return "Patient [ id = " + id + " ]";
		return "Patient [ id = " + getId() + " ]";
	}

}
