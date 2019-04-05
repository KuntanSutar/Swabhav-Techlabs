package isp.solution.test;

import isp.solution.IEater;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;

public class TestWorkerEater {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		atTheWorkStation(robot);
		atTheWorkStation(manager);
		atTheCafeteria(manager);
		//atTheCafeteria(robot);
	}

	private static void atTheWorkStation(IWorker iWorker) {
		System.out.println("At the work station!");
		iWorker.startWork();
		iWorker.stopWork();
	}

	private static void atTheCafeteria(IEater iEater) {
		System.out.println("At the cafeteria!");
		iEater.startEat();
		iEater.stopEat();
	}
}
