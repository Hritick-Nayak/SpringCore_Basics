package Com.MyProjects.SpringCore.DependencyCheck.DependencyCheck_InnerBeanAndScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MCForDepChkInBean {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext(
				"Com/MyProjects/SpringCore/DependencyCheck/DependencyCheck_InnerBeanAndScope/DepChekInBeanConfig.xml");

		Prescription prescription = (Prescription) cxt.getBean("prescription");

		System.out.println(prescription);

		((AbstractApplicationContext) cxt).close();

	}

}
