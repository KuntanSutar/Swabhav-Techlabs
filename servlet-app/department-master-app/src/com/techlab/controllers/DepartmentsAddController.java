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

@WebServlet("/add")
public class DepartmentsAddController extends HttpServlet {
       
    public DepartmentsAddController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/addForm.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptNo = Integer.parseInt(request.getParameter("deptNo"));
		String deptName = request.getParameter("deptName");
		String deptLocation = request.getParameter("deptLocation");
		Department department = new Department(deptNo, deptName, deptLocation);
		try {
			DepartmentsService departmentsService = new DepartmentsService(new DepartmentsRepository());
			departmentsService.add(department);
			List<Department> departmentList = departmentsService.getDepartments();
			request.setAttribute("departmentList", departmentList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/departments.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
