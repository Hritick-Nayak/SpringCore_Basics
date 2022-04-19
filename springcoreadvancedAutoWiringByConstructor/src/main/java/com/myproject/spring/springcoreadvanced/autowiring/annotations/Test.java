package com.myproject.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcoreadvanced/autowiring/annotations/Config.xml");
		Employee employee = (Employee) cxt.getBean("employee");

		System.out.println(employee);

		((AbstractApplicationContext) cxt).close();

	}

}
