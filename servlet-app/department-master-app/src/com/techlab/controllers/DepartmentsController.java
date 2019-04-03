package com.techlab.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Department;
import com.techlab.repository.DepartmentsRepository;
import com.techlab.service.DepartmentsService;

@WebServlet("/departments")
public class DepartmentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DepartmentsController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			DepartmentsRepository departmentsRepository = new DepartmentsRepository();
			DepartmentsService departmentsService = new DepartmentsService(departmentsRepository);
			List<Department> departmentList = departmentsService.getDepartments();
			request.setAttribute("departmentList", departmentList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/departments.jsp");
			requestDispatcher.forward(request, response);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
