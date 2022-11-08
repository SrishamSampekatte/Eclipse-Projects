package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.PhotoShoot;

public class PhotoShooting extends PhotoShoot {
	public PhotoShooting() {
		System.out.println(" Default constructor of photoshoot");
	}
	public PhotoShooting(String brand, String type, double price) {
		super(brand,type,price);
	}
}
