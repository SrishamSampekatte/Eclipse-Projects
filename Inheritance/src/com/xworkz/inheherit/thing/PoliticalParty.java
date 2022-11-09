package com.xworkz.inheherit.thing;

public class PoliticalParty {
	public String partyPresident;
	public String siddanta;
	public String headOffice;

	public PoliticalParty(String partyPresident, String siddanta, String headOffice) {
		super();
		this.partyPresident = partyPresident;
		this.siddanta = siddanta;
		this.headOffice = headOffice;
	}

	public void dispaly() {
		System.out.println(" Printing Political party details (Parent )");
		System.out.println(this.partyPresident);
		System.out.println(this.siddanta);
		System.out.println(this.headOffice);
	}

}
