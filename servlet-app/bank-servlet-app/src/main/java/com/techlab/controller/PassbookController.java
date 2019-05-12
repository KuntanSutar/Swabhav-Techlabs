package com.techlab.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.business.Transaction;
import com.techlab.repository.AccountsRepository;
import com.techlab.service.AccountService;

public class PassbookController extends HttpServlet {

	public PassbookController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			String username = (String) session.getAttribute("username");
			AccountService service=null;
			try {
				service = new AccountService(AccountsRepository.getInstance());
				List<Transaction> transactionList = service.getTransactions(username);
				request.setAttribute("transactions", transactionList);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("views/passbook.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("views/login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
