package com.techlab.chain.of.responsibility;

public class FiveRupeesDispenser implements IDispenser {

	private IDispenser nextDispenser;

	@Override
	public void setNextChain(IDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 5) {
			int numberOfNotes = currency.getAmount() / 5;
			int remainingMoney = currency.getAmount() % 5;
			System.out.println("Dispensing " + numberOfNotes + ", 5 Rupees Notes");
			if (remainingMoney != 0) {
				this.nextDispenser.dispense(new Currency(remainingMoney));
			}
		} else {
			nextDispenser.dispense(new Currency(currency.getAmount()));
		}
	}

}
