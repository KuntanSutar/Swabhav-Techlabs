package com.techlab.account;

public class SavingAccount extends Account {

	public SavingAccount(int newNumber, String newName, double newBalance) {
		super(newNumber, newName, newBalance);
	}

	@Override
	public void withdraw(double amount) {

		if(this.balance-amount >= 1000) {
			this.balance=this.balance-amount;
		}
	}

}
