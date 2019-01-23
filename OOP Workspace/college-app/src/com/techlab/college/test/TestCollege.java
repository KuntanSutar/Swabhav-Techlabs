package com.techlab.college.test;

import java.util.*;

import com.techlab.person.Student;
import com.techlab.college.Branch;
import com.techlab.college.College;
import com.techlab.person.Professor;

public class TestCollege {
	
	public static void main(String[] args) {
		
		
		College college1 = new College("Atharva");
		Student student1 = new Student(1, "Goregaon", "13/4/1997", "Kuntan", college1, Branch.SCIENCE);
		college1.addStudent(student1);
		
		Professor professor1 = new Professor(2, "Goregaon", "17/4/19550", college1, "Kalekar");
		college1.addProfessor(professor1);
		printDetails(college1);
	}

	private static void printDetails(College college1) {
		System.out.println("College Name : "+college1.getName()+"\nIt has "+college1.getStudentCount()+" student");
		System.out.println("There details are as follows : ");
		List<Student> studentList=college1.getStudentList();
		for(Student student:studentList) {
			System.out.println("ID : "+student.getId()+" Name : "+student.getName()+" Address : "+student.getAddress()+" DOB : "+student.getDob());
		}
		List<Professor> professorList=college1.getProfessorList();
		for(Professor professor:professorList) {
			System.out.println("ID : "+professor.getId()+" Name : "+professor.getName()+" Address : "+professor.getAddress()+" Salary : "+professor.getSalary());
		}
	}

		/*for(Student element : studentList) {
			System.out.println("Student ID :" );
		}*/
}
