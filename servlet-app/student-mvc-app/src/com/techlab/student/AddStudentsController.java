package com.techlab.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddStudentsController extends HttpServlet {

	public AddStudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/form.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		String rollNo = request.getParameter("rollNo");
		System.out.println(name+"..."+cgpa+"..."+rollNo);
		
		if(!name.equals("") && !cgpa.equals("") && !rollNo.equals("")) {
			StudentsService studentsService = new StudentsService();
			studentsService.addStudent(new Student(name, cgpa, rollNo));
			response.sendRedirect("students");
		} else {
			request.setAttribute("name", name);
			request.setAttribute("cgpa", cgpa);
			request.setAttribute("rollNo", rollNo);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/form.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
