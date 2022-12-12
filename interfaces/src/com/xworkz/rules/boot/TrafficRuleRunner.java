package com.xworkz.rules.boot;

import com.xworkz.rules.made.TrafficRule;
import com.xworkz.rules.rules.Citizen;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRule rule = new Citizen();
		rule.documents();
		rule.helmet();
		rule.Seatbelt();
		rule.speedLimit();
		rule.followOneway();

	}

}
