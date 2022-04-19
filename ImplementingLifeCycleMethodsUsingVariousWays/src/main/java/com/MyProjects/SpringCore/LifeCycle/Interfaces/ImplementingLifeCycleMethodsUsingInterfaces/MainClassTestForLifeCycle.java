package com.MyProjects.SpringCore.LifeCycle.Interfaces.ImplementingLifeCycleMethodsUsingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTestForLifeCycle {

	public static void main(String[] args) {

		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/MyProjects/SpringCore/LifeCycle/Interfaces/ImplementingLifeCycleMethodsUsingInterfaces/LifeCycleInterfaceConfig.xml");

		Patient patient = (Patient) cxt.getBean("patient");

		System.out.println(patient);

		cxt.registerShutdownHook();
		cxt.close();

	}

}
