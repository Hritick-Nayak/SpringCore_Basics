package com.myproject.spring.springcore.list;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForTestingCollection {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/list/ListConfig.xml");
		Hospital hospital = (Hospital) cxt.getBean("hospital");

		System.out.println("Hospitl Name: " + hospital.getName());
		// System.out.println("Hospital's Departments: " + hospital.getDepartments());
		List<String> departments = hospital.getDepartments(); // ArrayList is created by default
		for (int i = 0; i < departments.size(); i++) {
			System.out.println("Department " + (i + 1) + " : " + departments.get(i));
		}

		((AbstractApplicationContext) cxt).close();

	}

}
