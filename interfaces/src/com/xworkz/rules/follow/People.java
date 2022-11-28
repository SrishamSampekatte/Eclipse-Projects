package com.xworkz.rules.follow;

import com.xworkz.rules.made.CovidRule;

public class People implements CovidRule {

	@Override
	public String socialDistance() {
		System.out.println("Social Distance is made compulsary");
		return null;
	}

	@Override
	public String lockDown() {
		System.out.println("People should not come out of home ");
		return null;
	}

	@Override
	public String useSnitizer() {
		System.out.println("made it compulsary while entering ");
		return null;
	}

	@Override
	public boolean mask() {
		System.out.println("Complulsary to wear masks");
		return false;
	}

	@Override
	public boolean penalty() {
		System.out.println("Penalty for not following abpve rules");
		return true;
	}

}
