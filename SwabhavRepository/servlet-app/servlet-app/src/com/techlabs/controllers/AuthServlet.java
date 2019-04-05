package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {

	public AuthServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("hello");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		 String username = request.getParameter("username");
         String password = request.getParameter("password");

         if(username.equals("admin") && password.equals("admin")) {
        	 printWriter.println("Welcome "+username);
        	 System.out.println("Welcome admin!");
         } else {
        	 printWriter.println("<h3 style='color:red'>Invalid username or password</h3>"+"<br>");
        	 printWriter.println("<a href='views/login.html'>Login</a>");
         }
	}

}
