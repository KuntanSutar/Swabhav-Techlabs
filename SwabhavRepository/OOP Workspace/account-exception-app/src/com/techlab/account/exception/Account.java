package com.techlab.account.exception;

public class Account {

	private int number;
	private String name;
	private double balance;
	private double withdrawAmount;

	public Account(int newNumber, String newName, double newBalance, double newWithdrawAmount) {
		number = newNumber;
		name = newName;
		balance = newBalance;
		withdrawAmount = newWithdrawAmount;
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
		balance = balance + newAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void withdraw() {
		if (withdrawAmount <= balance & balance - withdrawAmount >= 500) {
			balance = balance - withdrawAmount;
		} else {
			throw new InsufficientFundsException(this);
		}
	}

}
