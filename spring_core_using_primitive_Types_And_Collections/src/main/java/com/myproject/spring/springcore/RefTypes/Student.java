package com.myproject.spring.springcore.RefTypes;

public class Student {

	private Scores scores;
	private StudentInfos studentInfos;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public StudentInfos getStudentInfos() {
		return studentInfos;
	}

	public void setStudentInfos(StudentInfos studentInfos) {
		this.studentInfos = studentInfos;
	}

	public String toString() {
		return "Student [ scores = " + scores + ", studentInfos = " + studentInfos + " ]";
	}

}
