package com.techlabs.enums;

public enum Builder {
	FENDER, MARTIN, GIBSON;
	@Override
	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		default:
			break;
		}
		return null;
	}
}
