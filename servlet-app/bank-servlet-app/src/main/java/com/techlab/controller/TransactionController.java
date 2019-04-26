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

import com.techlab.repository.AccountsRepository;

public class TransactionController extends HttpServlet {
       
    public TransactionController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/transaction.html");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount = Integer.parseInt(request.getParameter("amount"));
		String transactionType = request.getParameter("type");
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String stringDate = formatter.format(date);  
	    System.out.println(amount+" got "+transactionType+" from account "+stringDate);
	    try {
			AccountsRepository repository = new AccountsRepository();
			/*int balance = repository.getBalance();
			System.out.println(balance);*/
			if(transactionType.equalsIgnoreCase("Deposite")) {
				repository.deposite(amount);
			}
			if(transactionType.equalsIgnoreCase("Withdraw")) {
				repository.withdraw(amount);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	    
	}

}
