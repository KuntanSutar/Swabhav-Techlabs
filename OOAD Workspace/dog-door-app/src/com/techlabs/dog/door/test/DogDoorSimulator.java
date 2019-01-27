package com.techlabs.dog.door.test;

import com.techlab.dog.door.DogDoor;
import com.techlab.dog.door.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor dogDoor1 = new DogDoor();
		Remote remote1 = new Remote(dogDoor1);
		System.out.println("Fido barks to go outside...");
		remote1.pressButton();
		System.out.println("\nFido has gone outside...");
		remote1.pressButton();
		System.out.println("\nFido's all done...");
		remote1.pressButton();
		System.out.println("\nFido's bark inside...");
		remote1.pressButton();
	}
}
