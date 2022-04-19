package com.MyProjects.SpringCore.LifeCycle.XmlConfig.ImplementingLifeCycleMethodsUsingXmlConfiguration;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassTestForLifeCycle {

	public static void main(String[] args) {

		// ApplicationContext cxt = new
		// ClassPathXmlApplicationContext("com/MyProjects/SpringCore/LifeCycle/XmlConfig/ImplementingLifeCycleMethodsUsingXmlConfiguration/LifeCycleConfig.xml");

		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext(
				"com/MyProjects/SpringCore/LifeCycle/XmlConfig/ImplementingLifeCycleMethodsUsingXmlConfiguration/LifeCycleConfig.xml");

		Patient patient = (Patient) cxt.getBean("patient");

		System.out.println(patient);

		// ((AbstractApplicationContext) cxt).close();
		cxt.registerShutdownHook();
		cxt.close();

	}

}
