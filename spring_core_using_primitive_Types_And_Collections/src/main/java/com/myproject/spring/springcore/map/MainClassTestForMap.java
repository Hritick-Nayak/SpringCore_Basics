package com.myproject.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTestForMap {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/map/MapConfig.xml");
		Customer customer = (Customer) cxt.getBean("customer");

		System.out.println(customer.toString());

		((AbstractApplicationContext) cxt).close();

	}

}
