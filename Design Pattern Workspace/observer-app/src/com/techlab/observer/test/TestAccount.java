package com.techlab.observer.test;

import com.techlab.observer.Account;
import com.techlab.observer.EmailListener;
import com.techlab.observer.SMSListener;

public class TestAccount {

	public static void main(String[] args) {
		
		Account account1 = new Account(1,"Kuntan", 5000);
		account1.registerListener(new EmailListener());
		account1.deposit(5000);
		account1.registerListener(new SMSListener());
		account1.withdraw(5000);
	}

}

