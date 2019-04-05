package com.techlab.account;

public class CurrentAccount extends Account {

	
	public CurrentAccount(int newNumber, String newName, double newBalance) {
		super(newNumber, newName, newBalance);
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance-amount >= -2000) {
			this.balance=this.balance-amount;
		}
	}

}
