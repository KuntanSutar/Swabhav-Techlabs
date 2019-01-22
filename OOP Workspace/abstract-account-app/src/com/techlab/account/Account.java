package com.techlab.account;

public abstract class Account {

	protected int number;
	protected String name;
	protected double balance;
	
	public Account(int newNumber, String newName, double newBalance) {
		number = newNumber;
		name = newName;
		balance = newBalance;
	}	 
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double newAmount) {
		balance=balance+newAmount;
	}
	
	public abstract void withdraw(double amount);

	
}
