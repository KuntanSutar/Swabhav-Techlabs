package com.techlabs.account.test;

import com.techlab.account.Account;

public class TestEquality {

	public static void main(String[] args) throws Exception {

		Account account1 = new Account("Kuntan");
		Account account2 = new Account("Kuntan");

		System.out.println(account1 == account1);
		System.out.println(account1.equals(account1));

		System.out.println(account1 == account2);
		System.out.println(account1.equals(account2));
		System.out.println(account1);
		System.out.println(account2);
		Account account3 = (Account)account1.createClone();
		Account account4 = account3;
		System.out.println(account3);
		System.out.println(account4);
	}

}
