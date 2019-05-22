package com.techlab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.business.Student;
import com.techlab.service.StudentService;

@WebServlet("/delete")
public class DeleteStudentsController extends HttpServlet {

	public DeleteStudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		System.out.println("Delete Students Session : "+session);
		if(session==null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.html");
			requestDispatcher.forward(request, response);
		} else {
			String rollNo = request.getParameter("rollNo");
			StudentService studentsService = StudentService.getInstance();
			Student student = studentsService.getByRollNo(rollNo);
			studentsService.delete(student);
			System.out.println("Deleted Student : "+student.getName());
			response.sendRedirect("students");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
