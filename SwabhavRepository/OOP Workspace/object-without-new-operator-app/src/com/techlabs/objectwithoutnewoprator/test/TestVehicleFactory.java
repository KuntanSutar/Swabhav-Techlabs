package com.techlabs.objectwithoutnewoprator.test;

import com.techlab.objectwithoutnewoperator.Vehicle;
import com.techlab.objectwithoutnewoperator.VehicleFactory;

public class TestVehicleFactory {

	public static void main(String[] args) {
		VehicleFactory vehFac = new VehicleFactory();
		Vehicle veh1 = vehFac.getVehicle("AUTO");
		veh1.drive();

		Vehicle veh2 = vehFac.getVehicle("BOAT");
		veh2.drive();

		Vehicle veh3 = vehFac.getVehicle("BUS");
		veh3.drive();

		Vehicle veh4 = vehFac.getVehicle("TRAIN");
		veh4.drive();
	}

}
