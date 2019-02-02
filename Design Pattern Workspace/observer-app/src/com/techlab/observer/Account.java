package com.techlab.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNo;
	private String name;
	private double balance;
	private List<IAccountListener> listeners;
	
	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		listeners=new ArrayList();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IAccountListener> getListeners() {
		return listeners;
	}
	
	public void registerListener(IAccountListener newAccountListener) {
		listeners.add(newAccountListener);
	}
	
	public void deposit(double amount) {
		this.balance=balance+amount;
		notifyAllListerns();
	} 

	public void withdraw(double amount) {
		
		this.balance=balance-amount;
		notifyAllListerns();
	}
	
	private void notifyAllListerns() {
		for(IAccountListener listener:listeners) {
			listener.balanceChange(this);
		}
	}
}
