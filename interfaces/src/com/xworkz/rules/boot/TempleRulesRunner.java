package com.xworkz.rules.boot;

import com.xworkz.rules.made.TempleRules;
import com.xworkz.rules.rules.Bhaktas;

public class TempleRulesRunner {

	public static void main(String[] args) {
		TempleRules temple=new Bhaktas();
		temple.cleanness();
		temple.wearTraditional();
		temple.silence();
		temple.photography();
		temple.specialEntry();

	}

}
