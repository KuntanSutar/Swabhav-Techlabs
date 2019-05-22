package com.techlab.business;

public class Student {

	private String name;
	private String cgpa;
	private String rollNo;
	
	public Student(String name, String cgpa, String rollNo) {
		this.name = name;
		this.cgpa = cgpa;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
}
