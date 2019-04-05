package srp.solution;

public class Invoice {
	
	private int id;
	private String name;
	private double cost;
	private float discount;
	private float gst;
	
	public Invoice(int id, String name, double cost, float discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}
	
	public double calcTax() {
		return (cost*gst)/100;
	}
	
	public double calcTotalCost() {
		return cost+this.getDiscount()-this.calcTax();
	}
	
	public void printInvoice() {
		System.out.println(calcTotalCost());
	}
	
}
