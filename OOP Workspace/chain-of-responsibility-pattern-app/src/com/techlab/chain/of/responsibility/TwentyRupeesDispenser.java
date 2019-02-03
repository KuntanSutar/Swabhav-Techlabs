package com.techlab.chain.of.responsibility;

public class TwentyRupeesDispenser implements IDispenser {

	private IDispenser nextDispenser;

	@Override
	public void setNextChain(IDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 20) {

			int numberOfNotes = currency.getAmount() / 20;
			int remainingMoney = currency.getAmount() % 20;
			System.out.println("Dispensing " + numberOfNotes + ", 20 Rupees Notes");

			if (remainingMoney != 0) {
				nextDispenser.dispense(new Currency(remainingMoney));
			}
		} else {
			nextDispenser.dispense(new Currency(currency.getAmount()));
		}
	}

}
