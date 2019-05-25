package com.techlab.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.business.Account;
import com.techlab.business.Transaction;
import com.techlab.repository.AccountRepository;

@Service("service")
public class AccountService {

	@Autowired
	private AccountRepository repository;

	public List<Account> getAccountList() throws SQLException {
		return repository.getAccountList();
	}

	public void register(Account account) throws SQLException {
		repository.register(account);
	}
	
	public Account getAccount(String name) throws SQLException {
		return repository.getAccount(name);
	}
	
	public void deposite(Account account, int amount) throws SQLException {
		repository.deposite(account, amount);
	}
	
	public void withdraw(Account account, int amount) throws SQLException {
		repository.withdraw(account, amount);
	}
	
	public List<Transaction> getTransactions(String name) throws SQLException {
		return repository.getTransactions(name);
	}
	
}
