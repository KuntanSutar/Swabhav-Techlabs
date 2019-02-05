package com.techlab.chain.of.responsibility;

public class FiftyRupeesDispenser implements IDispenser {

	private IDispenser nextDispenser;

	@Override
	public void setNextChain(IDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 50) {

			int numberOfNotes = currency.getAmount() / 50;
			int remainingMoney = currency.getAmount() % 50;
			System.out.println("Dispensing " + numberOfNotes + ", 50 Rupees Note(s)");

			if (remainingMoney != 0) {
				nextDispenser.dispense(new Currency(remainingMoney));
			}
		} else {
			nextDispenser.dispense(new Currency(currency.getAmount()));
		}
	}

}
