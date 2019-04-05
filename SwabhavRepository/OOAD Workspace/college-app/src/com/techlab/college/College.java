package com.techlab.college;

import java.util.ArrayList;
import java.util.List;

import com.techlab.person.Professor;
import com.techlab.person.Student;

public class College {

	private String name;
	private ArrayList<Student> studentList = new ArrayList();
	private ArrayList<Professor> professorList = new ArrayList();
	
	public College(String newName) {
		name=newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void addStudent(Student newStudent) {
		studentList.add(newStudent);
	}
	
	public void addProfessor(Professor newProfessor) {
		professorList.add(newProfessor);
	}
	
	public int getStudentCount() {
		return studentList.size();
	}
	
	public int getProfessorCount() {
		return professorList.size();
	}
	
	public List getStudentList() {
		return studentList;
	}
	
	public List getProfessorList() {
		return professorList;
	}
	
}
