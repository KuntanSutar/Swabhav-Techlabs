package com.techlab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlab.business.Account;
import com.techlab.repository.AccountsRepository;
import com.techlab.service.AccountService;

@WebServlet("/register")
public class RegisterController extends HttpServlet {

	public RegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		int balance = Integer.parseInt(request.getParameter("balance"));
		String password = request.getParameter("password");
		try {
			AccountsRepository repository = new AccountsRepository();
			AccountService service = new AccountService(repository);
			service.addAccount(new Account(username, balance, password));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("accounts.jsp");
		dispatcher.forward(request, response);
	}

}
