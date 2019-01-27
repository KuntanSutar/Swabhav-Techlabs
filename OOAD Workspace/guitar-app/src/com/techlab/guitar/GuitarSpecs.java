package com.techlab.guitar;

public class GuitarSpecs {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpecs(Builder newBuilder, String newModel, Type newType, Wood newBackWood, Wood newTopWood) {

		builder = newBuilder;
		model = newModel;
		type = newType;
		backWood = newBackWood;
		topWood = newTopWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
}
