package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class TestWorker {

	public static void main(String[] args) {

		Manager manager = new Manager();
		Robot robot = new Robot();
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		atTheCafeteria(manager);
		atTheCafeteria(robot);
	}

	private static void atTheWorkStation(IWorker iWorker) {
		System.out.println("At work station");
		iWorker.startWork();
		iWorker.stopWork();
	}

	private static void atTheCafeteria(IWorker iWorker) {
		System.out.println("At cafeteria");
		iWorker.startEat();
		iWorker.stopEat();
	}
}
