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

@WebServlet("/edit")
public class DepartmentsEditController extends HttpServlet {
       
    public DepartmentsEditController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int deptNo = Integer.parseInt(request.getParameter("deptNo"));
    	System.out.println(deptNo);
    	try {
			DepartmentsService departmentsService = new DepartmentsService(new DepartmentsRepository());
			Department department = departmentsService.getDepartmentByNumber(deptNo);
			System.out.println("Edit Department : "+department.getName());
			request.setAttribute("deptNo", department.getNumber());
			request.setAttribute("deptName", department.getName());
			request.setAttribute("deptLocation", department.getLocation());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/editForm.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response,String url) throws ServletException, IOException {
    	int deptNo = Integer.parseInt(url);
    	System.out.println(deptNo);
    	try {
			DepartmentsService departmentsService = new DepartmentsService(new DepartmentsRepository());
			Department department = departmentsService.getDepartmentByNumber(deptNo);
			System.out.println("Edit Department : "+department.getName());
			request.setAttribute("deptNo", department.getNumber());
			request.setAttribute("deptName", department.getName());
			request.setAttribute("deptLocation", department.getLocation());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/editForm.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int deptNo = Integer.parseInt(request.getParameter("deptNo"));
			DepartmentsService departmentsService = new DepartmentsService(new DepartmentsRepository());
			Department department = departmentsService.getDepartmentByNumber(deptNo);
			department.setName(request.getParameter("deptName"));
			department.setLocation(request.getParameter("deptLocation"));
			List<Department> departmentList = departmentsService.getDepartments();
			System.out.println("After Edition Length "+departmentList.size());
			departmentsService.update(department);
			request.setAttribute("departmentList", departmentList);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/departments.jsp");
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
