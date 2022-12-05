package com.xworkz.rules.follow;

import com.xworkz.rules.made.TempleRules;

public class Bhaktas implements TempleRules {

	@Override
	public String wearTraditional() {
		System.out.println(" Should come in traditional wear");
		return null;
	}

	@Override
	public String cleanness() {
		System.out.println("Should come in clean");
		return null;
	}

	@Override
	public boolean silence() {
		System.out.println("Maintain silence");
		return false;
	}

	@Override
	public String photography() {
		System.out.println(" photography prohibitted");
		return null;
	}

	@Override
	public boolean specialEntry() {
		System.out.println(" Few temple has special entry");
		return true;
	}

}
