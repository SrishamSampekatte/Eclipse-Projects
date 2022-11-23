package com.xworkz.equal.boot;

import com.xworkz.equal.thing.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institution= new Institution("xworkz", "java", 30000, 10, "Aug-22", "Omkar", "Rajajinagar", 123456789l, true, 2);
		System.out.println(institution);

		Institution institution2= new Institution("xworkz", "java", 30000, 10, "Aug-22", "Omkar", "Rajajinagar", 123456789l, true, 2);
		System.out.println(institution2);

		boolean same6=institution.equals(institution2);
		System.out.println(same6);


	}

}
