package com.techlab.dog.door;

import java.util.*;

public class BarkRecognizer {

	private DogDoor dogDoor;

	public BarkRecognizer(DogDoor newdogDoor) {
		dogDoor = newdogDoor;
	}

	public void recognize(Bark newBark) {
		System.out.println("\nBark Recognizer heard " + newBark);
		List<Bark> familiarBarks = dogDoor.getFamiliarBarks();
		for (Iterator itr = familiarBarks.iterator(); itr.hasNext();) {
			Bark bark = (Bark) itr.next();
			if (bark.equals(bark)) {
				dogDoor.open();
				return;
			}
		}
		System.out.println("This Dog is not allowed!");
	}
}
