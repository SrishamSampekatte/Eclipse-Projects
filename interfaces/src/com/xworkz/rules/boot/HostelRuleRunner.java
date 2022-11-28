package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Hostelites;
import com.xworkz.rules.made.HostelRule;

public class HostelRuleRunner {

	public static void main(String[] args) {
		HostelRule rule = new Hostelites();
		rule.wakeup();
		rule.StudyTime();
		rule.antiRag();
		rule.gameTime();
		rule.breakFast();

	}

}
