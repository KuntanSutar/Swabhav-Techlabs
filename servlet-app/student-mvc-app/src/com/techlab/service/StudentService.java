package com.techlab.service;

import java.util.ArrayList;

import com.techlab.business.Student;

public class StudentService {

	private static ArrayList<Student> studentList = new ArrayList();
	private static StudentService service;
	
	private StudentService() {
	}

	public static StudentService getInstance() {
		if(service==null) {
			service = new StudentService();
		}
		return service;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void add(Student newStudent) {
		studentList.add(new Student(newStudent.getName(), newStudent.getCgpa(), newStudent.getRollNo()));
	}

	public static Student getByRollNo(String rollNo) {
		Student tempStudent = null;
		for (Student student : studentList) {
			if (student.getRollNo().equals(rollNo)) {
				tempStudent = student;
			}
		}
		return tempStudent;
	}

	public void edit(Student newStudent) {
		for (Student student : studentList) {
			if (student.getRollNo().equals(newStudent.getRollNo())) {
				student.setName(newStudent.getName());
				student.setCgpa(newStudent.getCgpa());
			}
		}
	}

	public void delete(Student newStudent) {
		String rollNo = newStudent.getRollNo();
		Student student = getByRollNo(rollNo);
		studentList.remove(student);
	}
}
