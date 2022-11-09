package com.xworkz.inheherit.boot;

import com.xworkz.inheherit.child.BaJaPa;
import com.xworkz.inheherit.thing.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		PoliticalParty party = new PoliticalParty("Amit Shaw", "Hindutva and Development", "Delhi");
		party.dispaly();
		System.out.println("--------------------------------------------");

		BaJaPa bjp = new BaJaPa("J P Nadda", "Hindutva and Development", "Delhi", 1980);
		bjp.display();
	}

}
