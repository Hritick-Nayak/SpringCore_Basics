package com.MyProjects.SpringCore.LifeCycle.Annotations.ImplementingLifeCycleMethodsUsingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	@PostConstruct // -> it will mark the hi method as init method
	public void hi() { // inIt method
		System.out.println("Inside hi Method");
	}

	@PreDestroy // -> it will mark the bye method as distroy method
	public void bye() { // distroy method
		System.out.println("Inside bye Method");
	}

	public String toString() {
		// return "Patient [ id = " + id + " ]";
		return "Patient [ id = " + getId() + " ]";
	}

}
