package com.techlab.bear;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectBeer")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BeerSelect() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		handleRequest(request,response);
	}

	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String colour = request.getParameter("color");
		BeerExpert beerExpert = new BeerExpert();
		List<String> beerList = beerExpert.getBrands(colour);
		System.out.println(beerList);
		request.setAttribute("brands", beerList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/view.jsp");
		dispatcher.forward(request, response);
	}
}
