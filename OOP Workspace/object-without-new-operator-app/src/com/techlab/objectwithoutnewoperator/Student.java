package com.techlab.objectwithoutnewoperator;

import java.io.*;

public class Student implements Serializable {
	private String name;
	private int rollno;
	private double cgpa;

	public Student(String newName, int newRollNo, double newCGPA) {
		name=newName;
		rollno=newRollNo;
		cgpa=newCGPA;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public double getCgpa() {
		return cgpa;
	}
	
}
