package com.techlab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.business.Account;
import com.techlab.repository.AccountsRepository;
import com.techlab.service.AccountService;

public class LoginController extends HttpServlet {

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AccountService service;
		try {
			service = new AccountService(AccountsRepository.getInstance());
			//Account account = service.getAccount(username);
			if (username.equals(password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				RequestDispatcher dispatcher = request.getRequestDispatcher("views/index.html");
				dispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
