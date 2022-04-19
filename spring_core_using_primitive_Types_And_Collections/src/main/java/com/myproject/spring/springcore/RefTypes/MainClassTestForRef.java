package com.myproject.spring.springcore.RefTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTestForRef {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/RefTypes/RefConfig.xml");

		Student student = (Student) cxt.getBean("student");

		System.out.println(student);

		((AbstractApplicationContext) cxt).close();
	}

}
