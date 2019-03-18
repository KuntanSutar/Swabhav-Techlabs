package com.techlab.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteStudentsController extends HttpServlet {

	public DeleteStudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String rollNo = request.getParameter("rollNo");
		StudentsService studentsService = new StudentsService();
		Student student = studentsService.getStudentByRollNo(rollNo);
		System.out.println("Deleted Student : "+student.getName());
		studentsService.deleteStudentDetails(student);
		response.sendRedirect("students");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
