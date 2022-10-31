package com.xworkz.constants.enums;

public enum Company {
	GOOGLE("google"), YAHOO("yahoo"), OUTLOOK("outlook");

	public String email;

	private Company(String email) {
		this.email = email;

	}

}
