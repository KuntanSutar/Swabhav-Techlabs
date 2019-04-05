package com.techlabs.account.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class TestAccount {

	public static void main(String[] args) {

		CurrentAccount currentAccount1 = new CurrentAccount(1, "Kuntan", 20000);
		SavingAccount savingAccount1 = new SavingAccount(2, "Prasad", 30000);
		printDetails(currentAccount1);
		printDetails(savingAccount1);
		currentAccount1.withdraw(22000);
		savingAccount1.withdraw(29000);
		printDetails(currentAccount1);
		printDetails(savingAccount1);
	}

	private static void printDetails(Account account) {

		System.out.println(account.getNumber()+" "+account.getName()+" "+account.getBalance());
	}

}
