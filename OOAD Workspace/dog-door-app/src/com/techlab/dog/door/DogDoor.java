package com.techlab.dog.door;

import java.util.*;

public class DogDoor {

	private boolean open;
	private static List<Bark> familiarBarks;

	public DogDoor() {
		this.open = false;
		familiarBarks = new ArrayList();
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public List<Bark> getFamiliarBarks() {
		return familiarBarks;
	}

	public void allNewFamiliarBark(Bark newBark) {
		familiarBarks.add(newBark);
	}
}
