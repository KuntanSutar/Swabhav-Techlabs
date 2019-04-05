package com.techlab.observer;

public class EmailListener implements IAccountListener {

	@Override
	public void balanceChange(Account newAccount) {
		System.out.println("Name : " + newAccount.getName() + ", Current balance : " + newAccount.getBalance()
				+ ", Account Number : " + newAccount.getAccountNo());
		System.out.println("Email regarding changes sent to your account");
	}

}

