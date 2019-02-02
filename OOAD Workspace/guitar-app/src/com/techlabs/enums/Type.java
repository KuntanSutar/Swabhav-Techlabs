package com.techlabs.enums;

public enum Type {
	ELECTRIC, ACOUSTIC;
	@Override
	public String toString() {
		switch (this) {
		case ELECTRIC:
			return "Electric";
		case ACOUSTIC:
			return "Acoustic";
		default:
			break;
		}
		return null;

	}
}
