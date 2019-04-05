package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationSessionServlet")
public class ApplicationSessionServlet extends HttpServlet {

	public ApplicationSessionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		Integer count = (Integer)servletContext.getAttribute("visitCount");
		
		if(count==null || count==0) {
			count=1;
		} else {
			count++;
		}
		response.setContentType("text/html");
		servletContext.setAttribute("visitCount", count);
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Session ID : "+request.getSession().getId()+"<br>");
		printWriter.print("Old Count : "+(count-1)+"<br>");
		printWriter.print("New Count : "+count+"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
