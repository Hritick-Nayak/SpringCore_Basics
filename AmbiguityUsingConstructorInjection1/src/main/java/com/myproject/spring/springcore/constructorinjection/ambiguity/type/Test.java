package com.myproject.spring.springcore.constructorinjection.ambiguity.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/constructorinjection/ambiguity/type/Config.xml");
		Addition addition = (Addition) cxt.getBean("addition");

		System.out.println(addition);

		((AbstractApplicationContext) cxt).close();

	}

}
