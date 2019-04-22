package com.techlab.service;

import java.sql.SQLException;
import java.util.List;

import com.techlab.business.Account;
import com.techlab.repository.AccountsRepository;

public class AccountService {

	private AccountsRepository accountsRepository;

	public AccountService(AccountsRepository accountsRepository) {
		this.accountsRepository=accountsRepository;
	}

	public List<Account> getDepartments() throws SQLException {
		return accountsRepository.getAccounts();
	}

	public void addAccount(Account account) throws SQLException {
		boolean addDepartment = accountsRepository.addAccount(account);
	}
}
