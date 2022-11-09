package com.xworkz.inheherit.child;

import com.xworkz.inheherit.thing.PoliticalParty;

public class BaJaPa extends PoliticalParty {

	public int since;

	public BaJaPa(String partyPresident, String siddanta, String headOffice, int since) {
		super(partyPresident, siddanta, headOffice);
		this.since = since;
	}

	public void display() {
		System.out.println(" Printing Bajapa details");
		super.dispaly();
		System.out.println(" Printing Bajapa details");
		System.out.println(this.since);
	}

}
