package com.xworkz.crudop.boot;

import com.xworkz.crudop.dto.Sample;

public class SampleRunner {

	public static void main(String[] args) {
		Sample validate = (int val) -> val + 0;
		System.out.println(validate.calculate(51));
	}

}
