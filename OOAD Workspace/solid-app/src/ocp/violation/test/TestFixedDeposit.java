package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit(1, "KUNTAN", 100000, 10, FestivalType.NEW_YEAR);
		System.out.println(fixedDeposit.calcSimpleInterest());
	}

}
