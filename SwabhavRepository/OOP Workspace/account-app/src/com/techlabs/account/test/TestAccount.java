package com.techlabs.account.test;

import com.techlab.account.Account;

public class TestAccount {

	public static void main(String[] args) {

		Account account1 = new Account("Kuntan", 20000.0);
		Account account2 = new Account("Prasad");
		account1.deposite(5000.0);
		account2.withdraw(5000.0);
		showDetails(account1);
		showDetails(account2);
		account2.withdraw(500.0);
	}

	public static void showDetails(Account newAccount) {

		System.out.println(newAccount.getName() + "..." + newAccount.getBalance());
	}
}
