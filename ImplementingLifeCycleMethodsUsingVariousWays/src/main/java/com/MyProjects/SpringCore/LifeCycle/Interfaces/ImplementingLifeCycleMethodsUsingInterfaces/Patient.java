package com.MyProjects.SpringCore.LifeCycle.Interfaces.ImplementingLifeCycleMethodsUsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

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

	public void afterPropertiesSet() throws Exception { // init method i.e after properties are set this method will be invoked
		System.out.println("Inside afterPropertiesSet Method");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy Method");
	}

}
