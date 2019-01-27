package com.techlab.facade;

public class VehicleMaker {

	private Boat boat;
	private Bus bus;
	
	public VehicleMaker() {
		bus=new Bus();
		boat=new Boat();
	}
	
	public void driveBus() {
		bus.drive();
	}
	
	public void driveBoat() {
		boat.drive();
	}
}
