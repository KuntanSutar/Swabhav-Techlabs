package com.techlab.dog.door;

public class Bark {

	private String sound;

	public Bark(String newSound) {
		sound = newSound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object newBark) {
		if (newBark instanceof Bark) {
			Bark bark = (Bark) newBark;
			if (sound.equalsIgnoreCase(bark.getSound())) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return sound;
	}
}
