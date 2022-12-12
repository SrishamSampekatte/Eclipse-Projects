package com.xworkz.rules.boot;

import com.xworkz.rules.made.NccRules;
import com.xworkz.rules.rules.Students;

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
