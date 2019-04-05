package com.techlabs.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;
import com.techlabs.repository.Guitar;
import com.techlabs.repository.GuitarSpec;

public class Inventory {
	List<Guitar> guitars=new ArrayList<Guitar>();

	public List<Guitar> getGuitars() {
		return guitars;
	}
	
	public void addGuitar(String serialNumber,double price,String model,Builder builder,
			Type type,Wood backWood,Wood topWood,int numString) {
		
		GuitarSpec spec=new GuitarSpec(model,builder,type,backWood,topWood,numString);
		Guitar guitar=new Guitar(serialNumber,price,spec);
		guitars.add(guitar);
	}
	
	public List<Guitar> search(GuitarSpec spec){
		List<Guitar> matchingGuitars=new LinkedList<Guitar>();
		for(Iterator<Guitar> i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar)i.next();
			if(guitar.getSpec().matches(spec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
	
}
