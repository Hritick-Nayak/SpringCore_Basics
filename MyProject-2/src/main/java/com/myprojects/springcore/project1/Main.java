package com.myprojects.springcore.project1;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	//	static List<StudentDetail> studentDetails = new ArrayList<StudentDetail>();
	static List<StudentDetail> studentDetails;

	public static void main(String[] args) {

		//		List<StudentDetail> studentDetails = new ArrayList<StudentDetail>();

		Scanner sc = new Scanner(System.in);
		ApplicationContext cxt = new ClassPathXmlApplicationContext("com/myprojects/springcore/project1/Config.xml");
		StudentDetail studentDetail = (StudentDetail) cxt.getBean("studentDetail");
		((AbstractApplicationContext) cxt).close();

		System.out.println("Enter no of students");
		int no = Integer.parseInt(sc.nextLine());

		int i = 0;
		while (i < no) {

			System.out.println("Enter student's name");
			String name = sc.nextLine();

			System.out.println("Enter student's roll number");
			int rollNo = Integer.parseInt(sc.nextLine());

			System.out.println("Enter student's address");
			String address = sc.nextLine();

			System.out.println("Enter student's phone number");
			long phoneNo = Long.parseLong(sc.nextLine());

			// studentDetail = new StudentDetail(name, address, rollNo, phoneNo);

			// studentDetails.add(studentDetail);

			studentDetail.setName(name);
			studentDetail.setRollNo(rollNo);
			studentDetail.setPhoneNo(phoneNo);
			studentDetail.setAddress(address);
			
			System.out.println(studentDetail.hashCode());

			// studentDetails.add(studentDetail);

			// System.out.println("Students Name: " + studentDetail.getName());
			// System.out.println("Students Roll No.: " + studentDetail.getRollNo());
			// System.out.println("Students Phone No.: " + studentDetail.getPhoneNo());
			// System.out.println("Students Address: " + studentDetail.getAddress());

			// for (i = 0; i < studentDetails.size(); i++) {
				// System.out.println("Students Name: " + studentDetails.get(i).getName());
				// System.out.println("Students Roll No.: " + studentDetails.get(i).getRollNo());
				// System.out.println("Students Phone No.: " + studentDetails.get(i).getPhoneNo());
				// System.out.println("Students Address: " + studentDetails.get(i).getAddress());
			// }

			i++;
		}
		sc.close();

		// for (i = 0; i < studentDetails.size(); i++) {
			// System.out.println("Students Name: " + studentDetails.get(i).getName());
			// System.out.println("Students Roll No.: " + studentDetails.get(i).getRollNo());
			// System.out.println("Students Phone No.: " + studentDetails.get(i).getPhoneNo());
			// System.out.println("Students Address: " + studentDetails.get(i).getAddress());
		// }

	}
	
	public static void listCreator(StudentDetail studentDetail){
		studentDetails.add(studentDetail);
	}

}
