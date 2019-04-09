package com.techlab.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			StudentsService studentsService = new StudentsService();
			Student student = studentsService.getStudentByRollNo(rollNo);
			studentsService.deleteStudentDetails(student);
			System.out.println("Deleted Student : "+student.getName());
			response.sendRedirect("students");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
