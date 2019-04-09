package com.techlab.student;

import java.util.ArrayList;

public class StudentsService {

	private static ArrayList<Student> studentList = new ArrayList();

	public ArrayList<Student> getStudentBOList() {

		return studentList;
	}

	public void addStudentDetails(Student newStudent) {
		studentList.add(new Student(newStudent.getName(), newStudent.getCgpa(), newStudent.getRollNo()));
	}

	public static Student getStudentByRollNo(String rollNo) {
		Student tempStudent = null;
		for (Student student : studentList) {
			if (student.getRollNo().equals(rollNo)) {
				tempStudent = student;
			}
		}
		return tempStudent;
	}

	public void updateStudentDetails(Student newStudent) {
		for (Student student : studentList) {
			if (student.getRollNo().equals(newStudent.getRollNo())) {
				student.setName(newStudent.getName());
				student.setCgpa(newStudent.getCgpa());
			}
		}
	}

	public void deleteStudentDetails(Student newStudent) {
		String rollNo = newStudent.getRollNo();
		Student student = getStudentByRollNo(rollNo);
		studentList.remove(student);
	}
}
