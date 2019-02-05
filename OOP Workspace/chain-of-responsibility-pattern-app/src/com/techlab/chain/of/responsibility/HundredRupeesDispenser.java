package com.techlab.chain.of.responsibility;

public class HundredRupeesDispenser implements IDispenser {

	private IDispenser nextDispenser;

	@Override
	public void setNextChain(IDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 100) {

			int numberOfNotes = currency.getAmount() / 100;
			int remainingMoney = currency.getAmount() % 100;
			System.out.println("Dispensing " + numberOfNotes + ", 100 Rupees Note(s)");

			if (remainingMoney != 0) {
				nextDispenser.dispense(new Currency(remainingMoney));
			}
		} else {
			nextDispenser.dispense(new Currency(currency.getAmount()));
		}
	}

}
