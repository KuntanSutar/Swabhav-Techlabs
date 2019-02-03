package com.techlab.chain.of.responsibility;

public interface IDispenser {

	void setNextChain(IDispenser nextDispenserChain);
	
	void dispense(Currency currency);
}
