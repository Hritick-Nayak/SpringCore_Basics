package com.myproject.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForTestingSet {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/set/SetConfig.xml");
		
		CarDealer carDealer = (CarDealer) cxt.getBean("cardealer");
		
		System.out.println("Car Name: " + carDealer.getName());
		System.out.println("Car Models: " + carDealer.getModel()); // LinkedHashSet is returned by default
		
		((AbstractApplicationContext) cxt).close();

	}

}
