package com.techlab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	private String url ;
	
	public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		url = (String) request.getAttribute("url");
		System.out.println(url);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals(password)) {
			HttpSession session = request.getSession();
			System.out.println(" Login Session : "+session.getId());
			session.setAttribute("user", username);
			System.out.println(url);
			if(url==null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("views/home.jsp");
				dispatcher.forward(request, response);
				return;
			}
			if(url.endsWith("add")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("views/addForm.jsp");
				dispatcher.forward(request, response);
			}
			if(url.endsWith("edit")) {
				String[] URL = url.split("/");
				System.out.println(URL[0]);
				DepartmentsEditController controller = new DepartmentsEditController();
				controller.doGet(request, response, URL[0]);
			}
			return;
		} else {
			request.setAttribute("username", request.getParameter("username"));
			request.setAttribute("password", request.getParameter("password"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.html");
			dispatcher.forward(request, response);
			return;
		}
	}

}
