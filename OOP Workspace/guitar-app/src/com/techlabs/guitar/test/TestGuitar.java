package com.techlabs.guitar.test;

import com.techlab.guitar.Builder;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.Inventory;
import com.techlab.guitar.Type;
import com.techlab.guitar.Wood;

public class TestGuitar {

	public static void main(String[] args) {

		Inventory inventory1 = new Inventory();
		inventory1.addGuitar("1", 50000, Builder.FENDER, "A", Type.ELECTRIC, Wood.ALDER, Wood.CEDAR);
		Guitar guitar1 = inventory1.getGuitar("1");

		inventory1.addGuitar("2", 60000, Builder.COLLINGS, "B", Type.ACOUSTIC, Wood.COCOBOLO, Wood.MAPLE);
		Guitar guitar = inventory1.getGuitar("2");
	}

}
