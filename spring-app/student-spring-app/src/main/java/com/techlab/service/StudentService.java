package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.business.Student;
import com.techlab.repository.StudentRepository;

@Service("service")
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public StudentService() {
		System.out.println("Service Created");
	}

	public List<Student> getAllStudents() {
		return repository.getStudentList();
	}

	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}
	
}
