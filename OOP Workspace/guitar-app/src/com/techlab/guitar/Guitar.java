package com.techlab.guitar;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpecs specs;

	public Guitar(String newSerialNumber, double newPrice, GuitarSpecs newSpecs) {

		serialNumber = newSerialNumber;
		price = newPrice;
		specs = newSpecs;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public GuitarSpecs getGuitarSpecs() {
		return specs;
	}

}
