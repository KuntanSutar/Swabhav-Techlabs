package com.techlab.chain.of.responsibility.test;

import java.util.Scanner;

import com.techlab.chain.of.responsibility.Currency;
import com.techlab.chain.of.responsibility.FiftyRupeesDispenser;
import com.techlab.chain.of.responsibility.FiveRupeesDispenser;
import com.techlab.chain.of.responsibility.HundredRupeesDispenser;
import com.techlab.chain.of.responsibility.IDispenser;
import com.techlab.chain.of.responsibility.TenRupeesDispenser;
import com.techlab.chain.of.responsibility.TwentyRupeesDispenser;

public class TestDispenser {

	public static void main(String[] args) {

		IDispenser hundredRupeesDispenser = new HundredRupeesDispenser();
		IDispenser fiftyRupeesDispender = new FiftyRupeesDispenser();
		IDispenser twentyRupeesDispenser = new TwentyRupeesDispenser();
		IDispenser tenRupeesDispenser = new TenRupeesDispenser();
		IDispenser fiveRupeesDispenser = new FiveRupeesDispenser();

		hundredRupeesDispenser.setNextChain(fiftyRupeesDispender);
		fiftyRupeesDispender.setNextChain(twentyRupeesDispenser);
		twentyRupeesDispenser.setNextChain(tenRupeesDispenser);
		tenRupeesDispenser.setNextChain(fiveRupeesDispenser);

		boolean wantToDispense=true;
		
		System.out.println("Welcome!!!");
		while (wantToDispense) {
			int amount = 0;
			System.out.println("Enter amount to dispense : ");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextInt();
			if (amount % 5 != 0) {
				System.out.println("Amount should be multiple of 5");
				return;
			}
			hundredRupeesDispenser.dispense(new Currency(amount));
			wantToDispense=false;
		}
	}

}
