package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Students;
import com.xworkz.rules.made.NccRules;

public class NccRulesRunner {

	public static void main(String[] args) {
		NccRules rule = new Students();
		rule.Uniform();
		rule.discipline();
		rule.morningDrill();
		rule.specialQuota();
		rule.strict();

	}

}
