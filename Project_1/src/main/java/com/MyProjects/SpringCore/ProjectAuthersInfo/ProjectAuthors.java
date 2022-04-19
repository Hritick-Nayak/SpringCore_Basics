package com.MyProjects.SpringCore.ProjectAuthersInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectAuthors {

	private Map<Integer, AuthorsInfo> authors = new HashMap<Integer, AuthorsInfo>();

//	public void createAuthorsMap(List<AuthorsInfo> authorsInfos) {
//		for(int i=0; i<authorsInfos.size(); i++) {
//			authors.put(authorsInfos.get(i).getAutherId(), authorsInfos.get(i));
//		}
////		this.setAuthers(authors);
//		System.out.println(authors);
//	}

	public Map<Integer, AuthorsInfo> getAuthers() {
		return authors;
	}

//	public void setAuthers(Map<Integer, AuthorsInfo> authors) {
//		this.authors = authors;
//	}

	public void setAuthers(List<AuthorsInfo> authorsInfos) {
		for (int i = 0; i < authorsInfos.size(); i++) {
			authors.put(authorsInfos.get(i).getAutherId(), authorsInfos.get(i));
//			this.authors = authors;
		}
	}

	@Override
	public String toString() {
		return "ProjectAuthors [ authors = " + authors + " ] ";
	}

}
