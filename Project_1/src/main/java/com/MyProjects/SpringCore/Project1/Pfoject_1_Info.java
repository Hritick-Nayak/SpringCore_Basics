package com.MyProjects.SpringCore.Project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.MyProjects.SpringCore.Projects.MyProjects;

public class Pfoject_1_Info {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/MyProjects/SpringCore/Project1/Config.xml");

		MyProjects myProjects = (MyProjects) cxt.getBean("myProjects");
		
		System.out.println(myProjects);
		
		((AbstractApplicationContext) cxt).close();

	}

}
