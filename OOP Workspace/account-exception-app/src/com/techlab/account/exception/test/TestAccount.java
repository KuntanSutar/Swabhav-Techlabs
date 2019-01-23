package com.techlab.account.exception.test;

import com.techlab.account.exception.Account;
import com.techlab.account.exception.InsufficientFundsException;

public class TestAccount {

	public static void main(String[] args) {
		Account account1 = new Account(1, "Kuntan", 2000, 2000);
		try {
			account1.withdraw();
		} catch (Exception ife) {
			System.out.println(ife.getMessage());
		}
	}

}
