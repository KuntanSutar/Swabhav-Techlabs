package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/login.html");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals(password)) {
			HttpSession session = request.getSession();
			System.out.println(" Login Session : "+session.getId());
			session.setAttribute("user", username);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/index.html");
			requestDispatcher.forward(request, response);
		} else {
			request.setAttribute("username", request.getParameter("username"));
			request.setAttribute("password", request.getParameter("password"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.html");
			dispatcher.forward(request, response);
		}
	}
	
}
