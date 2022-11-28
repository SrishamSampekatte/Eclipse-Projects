package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Student;
import com.xworkz.rules.made.SchoolRule;

public class SchoolRuleRunner {

	public static void main(String[] args) {
		SchoolRule rule=new Student();
		rule.attendence();
		rule.hairCoumb();
		rule.prayer();
		rule.uniform();
		rule.shistu();

	}

}
