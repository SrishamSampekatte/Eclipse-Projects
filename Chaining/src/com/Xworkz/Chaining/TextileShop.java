package com.Xworkz.Chaining;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public float ownerDaughterNumber;
	public int shopNo;
	public float contactNo;

	public TextileShop() {
		System.out.println("Batte angadi");
	}

	public TextileShop(String ownerDaughterName, int shopNo) {
		this.ownerDaughterName = ownerDaughterName;
		this.shopNo = shopNo;
	}

	public TextileShop(String ownerName) {
		this.ownerName = ownerName;
	}

	public TextileShop(String ownerName, float contactNo) {
		this.ownerName = ownerName;
		this.contactNo = contactNo;
	}

	public TextileShop(String ownerName, float contactNo, String ownerWifeName) {
		this(ownerName, contactNo);
		this.ownerWifeName = ownerWifeName;
	}

	public TextileShop(String ownerName, float contactNo, String ownerWifeName, String ownerDaughterName) {
		this(ownerName, contactNo, ownerWifeName);
		this.ownerDaughterName = ownerDaughterName;
	}

	public TextileShop(String ownerName, float contactNo, String ownerWifeName, String ownerDaughterName,
			float ownerDaughterNumber) {
		this(ownerName, contactNo, ownerWifeName, ownerDaughterName);
		this.ownerDaughterNumber = ownerDaughterNumber;
	}

	public TextileShop(String ownerName, float contactNo, String ownerWifeName, String ownerDaughterName,
			float ownerDaughterNumber, int shopNo) {
		this(ownerName, contactNo, ownerWifeName, ownerDaughterName, ownerDaughterNumber);
		this.shopNo = shopNo;
	}

}
