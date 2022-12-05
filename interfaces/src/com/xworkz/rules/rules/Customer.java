package com.xworkz.rules.follow;

import com.xworkz.rules.made.Hotel;

public class Customer implements Hotel{

	@Override
	public String location() {
		System.out.println("In a populated area");
		return null;
	}

	@Override
	public String hygenic() {
		System.out.println("Should be");
		return null;
	}

	@Override
	public boolean variety() {
		return true;
	}

	@Override
	public boolean price() {
		return false;
	}

	@Override
	public boolean fres() {
		return true;
	}

}
