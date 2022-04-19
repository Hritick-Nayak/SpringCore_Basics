package com.MyProjects.SpringCore.Projects;

import java.util.List;

public class MyProjects {

	private int projectId;
	private String projectName;
	private List<String> projectAuthors;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<String> getProjectAuthors() {
		return projectAuthors;
	}

	public void setProjectAuthors(List<String> projectAuthors) {
		this.projectAuthors = projectAuthors;
	}

	@Override
	public String toString() {
		return "MyProjects [ projectId = " + projectId + ", projectName = " + projectName + ", projectAuthors = "
				+ projectAuthors + " ] ";
	}

	
	
}
