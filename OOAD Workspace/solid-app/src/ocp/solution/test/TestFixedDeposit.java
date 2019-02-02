package ocp.solution.test;

import ocp.solution.NormalRateCalculator;
import ocp.solution.DiwaliRateCalculator;
import ocp.solution.FestivalType;
import ocp.solution.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit1 = new FixedDeposit(1, "KUNTAN", 100000, 10, new NormalRateCalculator());
		System.out.println(fixedDeposit1.calcRate());
		
		FixedDeposit fixedDeposit2 = new FixedDeposit(2, "KUNTAN", 100000, 10, new DiwaliRateCalculator());
		System.out.println(fixedDeposit2.calcRate());
		
	}

}
