package com.xworkz.interfaces.impliments;

import com.xworkz.interfaces.rules.AirportRules;

public class AirportAutharity {
	private AirportRules rules;

	public AirportAutharity() {
		System.out.println("Running default constructor");
	}

	public AirportAutharity(AirportRules rules) {
		this.rules = rules;
		System.out.println("Running pram constructor ");
	}

	public void checkAirport() {
		System.out.println("Running the airport check");
		if (this.rules != null) {
			boolean cheking = this.rules.cheking();

			int boardingOnTime = this.rules.boardingOnTime();
			if(cheking ==false && boardingOnTime==4 ) {
				System.out.println("following rules");
			}
			else {
				System.out.println("not following the rules");
			}

		}
	}

}
