package com.myproject.spring.springcore;

public class MainClassForTestingNormalMethod {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(20);
		employee.setName("Hritick Nayak");

		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());

		Employee2 employee2 = new Employee2();
		employee2.setEmailId("hritick@gmail.com");

		System.out.println("Employee ID: " + employee2.getEmailId());

	}

}
