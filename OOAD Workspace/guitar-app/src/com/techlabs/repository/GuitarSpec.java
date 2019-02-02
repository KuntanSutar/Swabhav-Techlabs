package com.techlabs.repository;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;

public class GuitarSpec {
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private String model;
	private int numString;

	public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood,
			int numString) {
		
		this.model = model;
		this.builder = builder;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}

	public Builder getBuilder() {
		return builder;
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

	public String getModel() {
		return model;
	}

	public int getNumString() {
		return numString;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (numString != otherSpec.numString)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;

		return true;
	}

}
