package com.xworkz.rules.boot;

import com.xworkz.rules.made.CovidRule;
import com.xworkz.rules.rules.People;

public class CovidRulesRunner {

	public static void main(String[] args) {
		CovidRule rule = new People();
		rule.lockDown();
		rule.socialDistance();
		rule.mask();
		rule.useSnitizer();
		rule.penalty();
	}

}
