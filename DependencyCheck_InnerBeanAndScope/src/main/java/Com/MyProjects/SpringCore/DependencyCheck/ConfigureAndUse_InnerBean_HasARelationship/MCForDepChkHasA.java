package Com.MyProjects.SpringCore.DependencyCheck.ConfigureAndUse_InnerBean_HasARelationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MCForDepChkHasA {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"Com/MyProjects/SpringCore/DependencyCheck/ConfigureAndUse_InnerBean_HasARelationship/DepChekHasAConfig.xml");

		Employee employee = (Employee) cxt.getBean("employee");

		System.out.println(employee);

		((AbstractApplicationContext) cxt).close();

	}

}
