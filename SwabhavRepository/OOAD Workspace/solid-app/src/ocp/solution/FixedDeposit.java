package ocp.solution;

public class FixedDeposit {

	private int accountNo;
	private String name;
	private double principle;
	private int years;
	private IRateCalculator iRateCalculator;

	public FixedDeposit(int accountNo, String name, double principle, int years,
			IRateCalculator newIRateCalculator) {
		this.accountNo = accountNo;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.iRateCalculator = newIRateCalculator;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public double calcRate() {
		return principle*years*iRateCalculator.calcRate();	
	}
}
