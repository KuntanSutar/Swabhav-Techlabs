package com.techlab.controllers;

import java.util.List;
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

@WebServlet("/delete")
public class DepartmentsDeleteController extends HttpServlet {
	
    public DepartmentsDeleteController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			DepartmentsService departmentsService = new DepartmentsService(new DepartmentsRepository());
			int deptNo = Integer.parseInt(request.getParameter("deptNo"));
			Department department = departmentsService.getDepartmentByNumber(deptNo);
			departmentsService.delete(department);
			List<Department> departmentList = departmentsService.getDepartments();
			request.setAttribute("departmentList", departmentList);
			response.sendRedirect("departments");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
