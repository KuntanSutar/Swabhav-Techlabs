package com.techlab.observer;

public class SMSListener implements IAccountListener {

	@Override
	public void balanceChange(Account newAccount) {
		System.out.println("Name : " + newAccount.getName() + ", Current balance : " + newAccount.getBalance()
				+ ", Account Number : " + newAccount.getAccountNo());
		System.out.println("Message regarding changes sent to your cell phone");
	}
}

