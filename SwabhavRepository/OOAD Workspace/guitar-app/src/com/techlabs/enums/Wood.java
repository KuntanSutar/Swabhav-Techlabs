package com.techlabs.enums;

public enum Wood {
	ALDER, BASSWOOD, MAPLE;
	@Override
	public String toString() {
		switch (this) {
		case ALDER:
			return "Alder";
		case MAPLE:
			return "Maple";
		case BASSWOOD:
			return "Basswood";
		default:
			break;
		}
		return null;
	}
}
