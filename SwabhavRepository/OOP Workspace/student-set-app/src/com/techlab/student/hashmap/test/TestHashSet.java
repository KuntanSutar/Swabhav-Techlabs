package com.techlab.student.hashmap.test;

import java.util.*;

import com.techlab.student.Student;

public class TestHashSet {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Kuntan", "Sutar");
		Student student2 = new Student(1, "Kuntan", "Sutar");
		Set<Student> students;
		students = new HashSet();
		students.add(student1);
		students.add(student2);
		students.add(student1);
		System.out.println(students.size());
		System.out.println(student1);
		System.out.println(student2);
	}

}
