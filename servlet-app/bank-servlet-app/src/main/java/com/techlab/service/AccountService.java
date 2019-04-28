package com.techlab.service;

import java.sql.SQLException;
import java.util.List;

import com.techlab.business.Account;
import com.techlab.business.Transaction;
import com.techlab.repository.AccountsRepository;

public class AccountService {

	private AccountsRepository repository;

	public AccountService(AccountsRepository accountsRepository) {
		this.repository=accountsRepository;
	}

	public List<Account> getDepartments() throws SQLException {
		return repository.getAccounts();
	}

	public void addAccount(Account account) throws SQLException {
		boolean addDepartment = repository.addAccount(account);
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
