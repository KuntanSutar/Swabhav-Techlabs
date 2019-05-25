package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlab.business.Student;

@Repository("repository")
public class StudentRepository {

	private List<Student> studentList=new ArrayList<Student>();

	public StudentRepository() {
		studentList.add(new Student("ram", "9", "101"));
		studentList.add(new Student("Sham", "8", "102"));
		System.out.println("Repository Created");
	}

	public List<Student> getStudentList() {
		return studentList;
	}

}
