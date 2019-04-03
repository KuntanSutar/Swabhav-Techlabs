package com.techlab.controllers;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/home")
public class DeptHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeptHomeController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/home.jsp");
		requestDispatcher.forward(request, response);
		try {
			System.out.println(new DepartmentsRepository().getDepartments().size());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
