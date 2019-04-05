package srp.solution;

public class InvoicePrinter {

	public void printInvoice() {
		
		Invoice invoice1 = new Invoice(1, "PD", 100, 10f, 18);
		System.out.println(invoice1.calcTotalCost());
	}
}
