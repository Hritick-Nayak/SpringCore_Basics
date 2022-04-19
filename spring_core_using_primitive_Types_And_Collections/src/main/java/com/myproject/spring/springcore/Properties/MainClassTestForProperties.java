package com.myproject.spring.springcore.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTestForProperties {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/myproject/spring/springcore/Properties/PropConfig.xml");
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) cxt.getBean("countryAndLangs");

		System.out.println(countriesAndLanguages.toString());

		((AbstractApplicationContext) cxt).close();

	}

}
