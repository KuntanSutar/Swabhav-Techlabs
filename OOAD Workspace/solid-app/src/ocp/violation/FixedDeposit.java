package ocp.violation;

public class FixedDeposit {

	private int accountNo;
	private String name;
	private double principle;
	private int years;
	private FestivalType festivalType;
	
	public FixedDeposit(int accountNo, String name, double principle, int years, FestivalType festivalType) {
		this.accountNo = accountNo;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festivalType = festivalType;
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

	public FestivalType getFestivalType() {
		return festivalType;
	}
	
	public double calcSimpleInterest() {
		if(getFestivalType()==getFestivalType().NEW_YEAR) {
			return principle*years*7.5;
		}
		if(getFestivalType()==getFestivalType().HOLI) {
			return principle*years*8.0;
		}
		return principle*years*7.0;
	}
}
