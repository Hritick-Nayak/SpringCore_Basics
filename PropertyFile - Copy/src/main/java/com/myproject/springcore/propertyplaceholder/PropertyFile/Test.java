package com.myproject.springcore.propertyplaceholder.PropertyFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/springcore/propertyplaceholder/PropertyFile/Config.xml");
		MyDAO mydao = (MyDAO) cxt.getBean("mydao");

		System.out.println(mydao);

		((AbstractApplicationContext) cxt).close();

	}

}
