package com.techlab.bear;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

	public List<String> getBrands(String colour) {
		List<String> brands = new ArrayList<String>();
		if(colour.equals("light")) {
			brands.add("Miller");
			brands.add("Bira White");
		}
		if(colour.equals("amber")) {
			brands.add("Corona");
			brands.add("Bira Wheat");
		}
		if(colour.equals("brown")){
			brands.add("Budwiser");
			brands.add("Kingfisher Storm");
		}
		if(colour.equals("dark")){
			brands.add("Kingfisher Strong");
			brands.add("Tuborg");
		}
		return brands;
	}
}
