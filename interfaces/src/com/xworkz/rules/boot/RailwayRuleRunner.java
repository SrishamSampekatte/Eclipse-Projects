package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Passangers;
import com.xworkz.rules.made.RailwayRule;

public class RailwayRuleRunner {

	public static void main(String[] args) {
	RailwayRule rail=new Passangers();
	rail.checking();
	rail.departure();
	rail.destination();
	rail.price();rail.ticket();

	}

}
