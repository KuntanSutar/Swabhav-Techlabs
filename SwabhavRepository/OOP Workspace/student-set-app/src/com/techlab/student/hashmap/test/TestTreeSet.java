package com.techlab.student.hashmap.test;

import java.util.*;

import com.techlab.student.SortByFirstName;
import com.techlab.student.SortByLastName;
import com.techlab.student.Student;

public class TestTreeSet {

	public static void main(String[] args) {

		Student student2 = new Student(1, "Kuntan", "Sutar");
		Student student3 = new Student(2, "Prasad", "Shetty");
		Student student1 = new Student(1, "Kuntan", "Shanbag");
		Student student4 = new Student(1, "Kiran", "Sukerkar");
		Set<Student> studentlist1, studentlist2;
		studentlist1 = new TreeSet(new SortByFirstName());
		studentlist1.add(student1);
		studentlist1.add(student2);
		studentlist1.add(student1);
		studentlist1.add(student3);
		System.out.println();
		
		System.out.println("Sorted by first name in ascending order : ");
		System.out.println(studentlist1.size());
		System.out.println(student1);
		System.out.println(student2);
		printStudentDetails(studentlist1);
		
		System.out.println("Sorted by last name in descending order : ");
		studentlist2= new TreeSet(new SortByLastName());
		studentlist2.add(student1);
		studentlist2.add(student3);
		studentlist2.add(student4);
		printStudentDetails(studentlist2);
	}

	private static void printStudentDetails(Set<Student> students) {
		Iterator iterator = students.iterator();
		for(Student student:students) {
			System.out.println("ROLL NO : "+student.getRollNo()+"\t FIRST NAME : "+student.getFname()+"\t LAST NAME : "+student.getLname());
		}
	}

}
