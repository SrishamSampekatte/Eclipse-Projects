package com.xworkz.rules.boot;

import com.xworkz.rules.follow.Doctors;
import com.xworkz.rules.made.OperationTheater;

public class OperationTheaterRunner {

	public static void main(String[] args) {
		OperationTheater opp=new Doctors();
		opp.hygenic();
		opp.mask();
		opp.fast();
		opp.silence();
		opp.isolation();

	}

}
