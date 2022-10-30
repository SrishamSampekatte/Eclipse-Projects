package com.xworkz.constants.enums;

public enum Gender {

	MALE("Male"), FEMALE("Female"), TRANSGENDER("Transgender");

	public String linga;

	private Gender(String linga) {

		this.linga = linga;

	}
}
