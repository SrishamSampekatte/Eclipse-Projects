package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Trainee;
import com.xworkz.rules.made.Xworkz;

public class XworkzRunner {

	public static void main(String[] args) {
		Xworkz odc=new Trainee();
		odc.presentation();
		odc.Timings();
		odc.trainer();
		odc.strict();
		odc.fee();

	}

}
