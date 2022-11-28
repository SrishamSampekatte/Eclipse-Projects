package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Trekker;
import com.xworkz.rules.made.TrekkRule;

public class TrekkRuleRunner {

	public static void main(String[] args) {
		TrekkRule trekk=new Trekker();
		trekk.energy();
		trekk.distance();
		trekk.intrest();
		trekk.stamina();
		trekk.hill();

	}

}
