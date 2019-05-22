package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.Iterator;

import com.techlab.business.Student;
import com.techlab.service.StudentService;

@WebServlet("/students")
public class StudentsController extends HttpServlet {

	public StudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService studentsService = StudentService.getInstance();
		ArrayList<Student> studentList = studentsService.getStudentList();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		for(Student student:studentList) {
			printWriter.println(student.getName()+"..."+student.getCgpa()+"..."+student.getRollNo());
		}
		request.setAttribute("studentDetails", studentList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/students.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
