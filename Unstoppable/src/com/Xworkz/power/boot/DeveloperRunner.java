package com.Xworkz.power.boot;

import com.Xworkz.power.Developer;

public class DeveloperRunner {

	public static void main(String[] args) 
	{
		Developer software=new Developer();
		
		System.out.println(software.name);
		System.out.println(software.education);
		System.out.println(software.experiance);
		System.out.println(software.company);
		System.out.println(software.salary);
		
		software.name="ABCD";
		software.education="BE";
		software.experiance=3;
		software.company="Google";
		software.salary=987456;
		
		System.out.println("Name of a Developer"+software.name);
		System.out.println("Educational qualification"+software.education);
		System.out.println("Work experience in years"+software.experiance);
		System.out.println("Currently working in "+software.company);
		System.out.println("Current CTC in LPA"  +software.salary);
	

	}

}
