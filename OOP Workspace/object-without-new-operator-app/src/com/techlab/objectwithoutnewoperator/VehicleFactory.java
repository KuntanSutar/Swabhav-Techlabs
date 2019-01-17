package com.techlab.objectwithoutnewoperator;

public class VehicleFactory {
	public Vehicle getVehicle(String newVehicle) {
		if (newVehicle.equalsIgnoreCase("Auto")) {
			return new Auto();
		}
		if (newVehicle.equalsIgnoreCase("Boat")) {
			return new Boat();
		}
		if (newVehicle.equalsIgnoreCase("Bus")) {
			return new Bus();
		}
		if (newVehicle.equalsIgnoreCase("Train")) {
			return new Train();
		}
		return null;
	}
}
