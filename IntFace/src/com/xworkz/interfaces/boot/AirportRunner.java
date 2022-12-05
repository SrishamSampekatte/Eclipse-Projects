package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.impliments.AirportAutharity;
import com.xworkz.interfaces.rules.Passengers;

public class AirportRunner {

	public static void main(String[] args) {
		Passengers passenger=new Passengers();
		AirportAutharity airportAutharity =new AirportAutharity(passenger);
		airportAutharity.checkAirport();
	}

}

