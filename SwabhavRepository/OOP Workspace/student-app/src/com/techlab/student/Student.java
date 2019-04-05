package com.techlab.student;

public class Student {
	private String fname;
	private String lname;
	private double cgpa;
	private static int count;

	public Student(String fname, String lname, double cgpa) {
		this.fname = fname;
		this.lname = lname;
		this.cgpa = cgpa;
		System.out.println("Inside Constructor");
		count = count + 1;
	}

	static {
		count = 0;
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

	public int getCount() {
		return count;
	}

	public static int headCount() {
		return count;
	}

}
