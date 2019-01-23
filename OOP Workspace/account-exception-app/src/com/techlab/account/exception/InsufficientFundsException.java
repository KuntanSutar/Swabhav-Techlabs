package com.techlab.account.exception;

public class InsufficientFundsException extends RuntimeException {

	private Account account;

	public InsufficientFundsException(Account newAccount) {
		account = newAccount;
	}

	@Override
	public String getMessage() {
		return "Dear customer, " + account.getName() + " your balance is " + account.getBalance() + "\n"
				+ "You are trying to withdraw : " + account.getWithdrawAmount()
				+ "\nHence, your account has insufficient balance!";
	}
}
