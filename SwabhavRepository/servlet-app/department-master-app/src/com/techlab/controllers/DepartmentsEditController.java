package com.techlab.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.model.Department;
import com.techlab.repository.DepartmentsRepository;
import com.techlab.service.DepartmentsService;

@WebServlet("/edit")
public class DepartmentsEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentsEditController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		DepartmentsService service;
		try {
			service = new DepartmentsService(new DepartmentsRepository());
			Department department = service.getDepartmentById(Integer.parseInt(request.getParameter("deptNo")));
			
			System.out.println(department);
			request.setAttribute("deptNo", department.getDeptNo());
			request.setAttribute("deptName", department.getDeptName());
			request.setAttribute("deptLocation", department.getLocation());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/form.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("deptNo"));
		System.out.println(id);
		try {
			DepartmentsService service = new DepartmentsService(new DepartmentsRepository());
			Department department = service.getDepartmentById(id);
			department.setDeptName(request.getParameter("deptName"));
			department.setLocation(request.getParameter("deptLocation"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
