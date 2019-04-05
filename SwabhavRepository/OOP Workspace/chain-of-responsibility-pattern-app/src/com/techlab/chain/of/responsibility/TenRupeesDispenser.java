package com.techlab.chain.of.responsibility;

public class TenRupeesDispenser implements IDispenser {

	private IDispenser nextDispenser;

	@Override
	public void setNextChain(IDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(Currency currency) {

		if (currency.getAmount() >= 10) {

			int numberOfNotes = currency.getAmount() / 10;
			int remainingMoney = currency.getAmount() % 10;
			System.out.println("Dispensing " + numberOfNotes + ", 10 Rupees Note(s)");

			if (remainingMoney != 0) {
				this.nextDispenser.dispense(new Currency(remainingMoney));
			}
		} else {
			nextDispenser.dispense(new Currency(currency.getAmount()));
		}
	}

}
