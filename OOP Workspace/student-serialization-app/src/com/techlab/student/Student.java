package com.techlab.student;

import java.io.*;

public class Student implements Serializable {
	private int rollno;
	private int marks;

	public Student(int newRollNo, int newMarks) {
		rollno=newRollNo;
		marks=newMarks;
	}
	
	public int getRollno() {
		return rollno;
	}

	public int getMarks() {
		return marks;
	}

}
