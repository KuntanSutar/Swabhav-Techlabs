package com.techlab.dog.door;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private DogDoor dogDoor;

	public Remote(DogDoor newDogDoor) {
		dogDoor = newDogDoor;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if (dogDoor.isOpen()) {
			dogDoor.open();
		} else {
			dogDoor.open();
		}

		Timer timer1 = new Timer();
		timer1.schedule(new TimerTask() {
			public void run() {
				dogDoor.close();
				timer1.cancel();
			}
		}, 5000);
	}
}
