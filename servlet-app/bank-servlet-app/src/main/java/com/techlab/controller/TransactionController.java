package com.techlab.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.business.Account;
import com.techlab.repository.AccountsRepository;
import com.techlab.service.AccountService;

public class TransactionController extends HttpServlet {
       
    public TransactionController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/transaction.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if(session!=null) {
			String user = (String)session.getAttribute("username");
			int amount = Integer.parseInt(request.getParameter("amount"));
			String transactionType = request.getParameter("type");
			AccountService service;
			try {
				service = new AccountService(new AccountsRepository());
				Account account = service.getAccount(user);
				if(transactionType.equalsIgnoreCase("Deposite")) {
					service.deposite(account, amount);
				} else {
					service.withdraw(account, amount);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("views/login.html").forward(request, response);
		}
	}

}
