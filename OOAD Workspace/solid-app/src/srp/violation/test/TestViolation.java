package srp.violation.test;

import srp.violation.Invoice;

public class TestViolation {

	public static void main(String[] args) {

		Invoice invoice1 = new Invoice(1, "PD", 100, 10f, 18);
		invoice1.printInvoice();
	}

}
