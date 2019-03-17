package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

	public SessionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer count = (Integer)session.getAttribute("visitCount");
		
		if(count==null || count==0) {
			count=1;
		} else {
			count++;
		}
		response.setContentType("text/html");
		request.getSession().setAttribute("visitCount", count);
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Session ID : "+session.getId()+"<br>");
		printWriter.print("Old Count : "+(count-1)+"<br>");
		printWriter.print("New Count : "+count+"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
