package com.techlab.account;

public class Account implements Cloneable {

	private String name;
	private double balance;
	private int number;
	private static int nextAccountNumber;

	public Account(String newName, double newBalance) {
		name = newName;
		balance = newBalance;
		number = nextAccountNumber++;
	}

	public Account(String newName) {
		this(newName, 500.0);
	}

	static {
		nextAccountNumber = 0;
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

	public void deposite(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance & balance - amount >= 500) {
			balance = balance - amount;
		}
	}

	@Override
	public String toString()
	{
		return super.toString()+" "+getName()+" "+getNumber()+" "+getBalance();
	}
	
	@Override
	public boolean equals(Object obj) {
		Account account = (Account)obj;
        return (this.getName()==account.getName() & this.getBalance()==account.getBalance());
    }
	
	public Object createClone() throws CloneNotSupportedException {

		return super.clone();
	}

}
