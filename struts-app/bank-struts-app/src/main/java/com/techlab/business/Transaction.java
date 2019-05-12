package com.techlab.business;

public class Transaction {

	private String name;
	private int amount;
	private String type;
	private String date;
	
	public Transaction() {
		super();
	}

	public Transaction(String name, int amount, String type, String date) {
		super();
		this.name = name;
		this.amount = amount;
		this.type = type;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int balance) {
		this.amount = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
