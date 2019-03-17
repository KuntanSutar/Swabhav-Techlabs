package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

	public WelcomeServlet() {
		super();
		System.out.println("Welcome Servlet Created");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet called");
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		//String developerName = request.getParameter("developer");
		
		for(int i=1; i<=6; i++) {
			if (request.getParameter("developer") == null || request.getParameter("developer").equals("null")) {
				printWriter.print("<h"+i+">Welcome to Servlet</h"+i+">");
			} else {
				printWriter.print("<h"+i+">"+" Hello " + request.getParameter("developer")+"</h\"+i+\">");
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost called");
	}

}
