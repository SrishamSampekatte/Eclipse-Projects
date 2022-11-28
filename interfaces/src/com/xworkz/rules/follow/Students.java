package com.xworkz.rules.follow;

import com.xworkz.rules.made.NccRules;

public class Students implements NccRules {

	@Override
	public String Uniform() {
		System.out.println(" Should wear uniform");
		return null;
	}

	@Override
	public String morningDrill() {
		System.out.println("Every one should go for morning drill");
		return null;
	}

	@Override
	public boolean specialQuota() {
		System.out.println(" Ncc candidate has special quota in govt jobs");
		return true;
	}

	@Override
	public boolean discipline() {
		System.out.println(" Has dicipline");
		return false;
	}

	@Override
	public boolean strict() {
		System.out.println(" Hell of a strict");
		return true;
	}

}
