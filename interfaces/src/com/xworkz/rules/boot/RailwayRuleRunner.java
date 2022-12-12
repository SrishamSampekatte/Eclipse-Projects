package com.xworkz.rules.boot;

import com.xworkz.rules.made.RailwayRule;
import com.xworkz.rules.rules.Passangers;

public class RailwayRuleRunner {

	public static void main(String[] args) {
	RailwayRule rail=new Passangers();
	rail.checking();
	rail.departure();
	rail.destination();
	rail.price();rail.ticket();

	}

}
