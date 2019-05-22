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

@WebServlet("/edit")
public class EditStudentsController extends HttpServlet {

	public EditStudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		System.out.println("Edit Students Session : "+session);
		if(session==null || session.getAttribute("user")==null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.html");
			requestDispatcher.forward(request, response);
		} else {
			String rollNo = request.getParameter("rollNo");
			StudentService studentsService = StudentService.getInstance();
			Student student = studentsService.getByRollNo(rollNo);
			System.out.println("Edit Student : "+student.getName());
			request.setAttribute("name", student.getName());
			request.setAttribute("cgpa", student.getCgpa());
			request.setAttribute("rollNo", student.getRollNo());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/edit.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		String rollNo = request.getParameter("rollNo");
		System.out.println(name+"..."+cgpa+"..."+rollNo);
		
		if(!name.equals("") && !cgpa.equals("") && !rollNo.equals("")) {
			StudentService studentsService = StudentService.getInstance();
			studentsService.edit(new Student(name, cgpa, rollNo));
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
