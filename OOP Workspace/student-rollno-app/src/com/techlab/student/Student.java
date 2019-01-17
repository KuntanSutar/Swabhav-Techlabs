package com.techlab.student;

public class Student {
	private String fname;
	private String lname;
	private double cgpa;
	private int rollno;
	private static int rollNoCount;
	
	public Student(String fname, String lname, double cgpa)
	{
		System.out.println("Inside Constructor");
		this.fname=fname;
		this.lname=lname;
		this.cgpa=cgpa;
		this.rollno=rollNoCount;
		rollNoCount++;
	}
	static
	{
		rollNoCount=1001;
		System.out.println("Inside Static Block");
	}
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public double getCgpa() {
		return cgpa;
	}
	
	public int headRollNo() {
		return rollNoCount;
	}
	
	public int getRollNo() {
		return rollno;
	}
}
