package com.myproject.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForTesting {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("PrimitiveConfig.xml");
		// if the xml file is present in a pakage then we need to give the whole pakage
		// using forward slash / insted of .
		// but since it is directly under sorce/main/java folder just the name will work

		// Object empObj = ctx.getBean("emp");
		Employee employee = (Employee) ctx.getBean("emp"); // By default it returns object but as we need to convert it
															// to employee we are type casting it

		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());

		Employee2 employee2 = (Employee2) ctx.getBean("emp2");

		System.out.println("Employee ID: " + employee2.getEmailId());

		ctx.close();

	}

}
