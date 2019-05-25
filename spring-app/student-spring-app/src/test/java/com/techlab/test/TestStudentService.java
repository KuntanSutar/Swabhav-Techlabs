package com.techlab.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlab.business.Student;
import com.techlab.service.StudentService;

public class TestStudentService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		StudentService service = (StudentService) context.getBean("service");
		List<Student> studentList = service.getAllStudents();
		System.out.println(studentList.size());
	}

}
