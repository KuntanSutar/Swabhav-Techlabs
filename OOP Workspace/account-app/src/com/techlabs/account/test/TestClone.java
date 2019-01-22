package com.techlabs.account.test;

import com.techlab.account.Account;

public class TestClone {

	public static void main(String[] args) throws Exception {

		Account account1 = new Account("Kuntan");
		Account account2 = (Account)account1.createClone();
		System.out.println(account1);
		System.out.println(account2);
	}

}
