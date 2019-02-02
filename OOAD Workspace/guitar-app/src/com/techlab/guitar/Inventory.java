package com.techlab.guitar;

import java.util.*;

public class Inventory {

	private List<Guitar> list1 = new ArrayList();

	public void addGuitar(String newSerialNumber, double newPrice, Builder newBuilder, String newModel, Type newType,
			Wood newBackWood, Wood newTopWood) {

		GuitarSpecs guitarSpecs1 = new GuitarSpecs(newBuilder, newModel, newType, newBackWood, newTopWood);
		list1.add(new Guitar(newSerialNumber, newPrice, guitarSpecs1));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator itr = list1.iterator(); itr.hasNext();) {
			Guitar guitar = (Guitar) itr.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> searchMatchingGuitar(GuitarSpecs newGuitarSpecs) {
		List<Guitar> matchingGuitars = new ArrayList();
		for(Iterator iterator=list1.iterator(); iterator.hasNext(); ) {
			Guitar guitar = (Guitar) iterator.next();
			if(guitar.getGuitarSpecs().checkEquality(newGuitarSpecs)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
}
