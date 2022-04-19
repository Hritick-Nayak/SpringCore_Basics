package com.MyProjects.SpringCore.ProjectAuthersInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTestForAuthors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<AuthorsInfo> authorsInfos = new ArrayList<AuthorsInfo>();

		System.out.println("Enter number of authors");
		int no = Integer.parseInt(sc.nextLine());

		System.out.println("Enter author Information");
		int i = 0;
		while (i < no) {
			System.out.println("Enter author ID");
			int authorId = Integer.parseInt(sc.nextLine());

			System.out.println("Enter author name");
			String autherName = sc.nextLine();

			System.out.println("Enter author address");
			String autherAddress = sc.nextLine();

			AuthorsInfo authorsInfo = new AuthorsInfo(authorId, autherName, autherAddress);
			authorsInfos.add(authorsInfo);

			i++;
		}
		
		sc.close();

		System.out.println("lol");
		
		ProjectAuthors projectAuthors = new ProjectAuthors();
//		projectAuthors.createAuthorsMap(authorsInfos);

		projectAuthors.setAuthers(authorsInfos);
		
		System.out.println(projectAuthors);

	}

}
