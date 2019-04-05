package com.techlabs.student.test;

import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Kuntan", "Sutar", 6.75);
		System.out.println("When " + s1.getFname() + " comes; head roll no is : " + s1.headRollNo());

		Student s2 = new Student("Prasad", "Shetty", 6.05);
		System.out.println("When " + s2.getFname() + " comes; head roll no is : " + s2.headRollNo());

		Student s3 = new Student("Kunal", "Sonawane", 5.55);
		System.out.println("When " + s3.getFname() + " comes; head roll no is : " + s3.headRollNo());

		// To check:
		System.out.println("After " + s3.getFname() + " is given his roll no; " + s2.getFname()
				+ "'s head roll no changed to : " + s2.headRollNo());

		System.out.println(s1.getFname() + "'s roll no : " + s1.getRollNo());
		System.out.println(s2.getFname() + "'s roll no : " + s2.getRollNo());
		System.out.println(s3.getFname() + "'s roll no : " + s3.getRollNo());

		// To check:
		System.out.println(s1.getFname() + "'s roll no : " + s1.getRollNo());

	}

}
