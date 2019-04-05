package dip.solution;

import dip.solution.DatabaseLogger;
import dip.solution.XMLLogger;

public class TaxCalculator {
	
	private ILogger iLogger;
	
	public TaxCalculator(ILogger newILogger) {
		iLogger=newILogger;
	}
	
	public int calcTax(int amount, int rate) {
		int rent=0;
		try {
			rent = amount / rate;
		} catch (Exception exp) {
			String errorMessage= exp.getMessage();
			if (iLogger instanceof DatabaseLogger) {
				new DatabaseLogger().log(errorMessage);
			}
			if (iLogger instanceof XMLLogger) {
				new XMLLogger().log(errorMessage);
			}
		}
		return rent;
	}
}