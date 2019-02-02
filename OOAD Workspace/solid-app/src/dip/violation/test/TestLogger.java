package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class TestLogger {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.DATABASE);
		System.out.println(taxCalculator.calcTax(0, 0));
 	}
}
