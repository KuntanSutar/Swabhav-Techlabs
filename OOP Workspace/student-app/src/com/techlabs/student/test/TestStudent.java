package com.techlabs.student.test;

import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Kuntan", "Sutar", 6.75);
		System.out.println(s1.getCount());
		System.out.println(Student.headCount());

		Student s2 = new Student("Prasad", "Shetty", 6.05);
		System.out.println(s2.getCount());
		System.out.println(Student.headCount());
		System.out.println(s2.headCount());

		Student s3 = new Student("Kunal", "Sonawane", 5.55);
		System.out.println(s3.getCount());
		System.out.println(Student.headCount());
		System.out.println(s3.headCount());

	}

}
