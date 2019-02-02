package dip.solution.test;

import dip.solution.DatabaseLogger;
import dip.solution.TaxCalculator;

public class TestLogger {

	public static void main(String[] args) {

		TaxCalculator taxCalculator = new TaxCalculator(new DatabaseLogger());
		System.out.println(taxCalculator.calcTax(0, 0));
	}

}
