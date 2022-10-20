package com.xworkz.constants.enums;

import com.xworkz.constants.HomeStay;
import com.xworkz.constants.Jeeps;


public class Kodachadri {
	
	public static String place="kodachadrii";
	public String view;
	public HomeStay homeStay;
	public Jeeps jeeps;
	
	public Kodachadri(String view,HomeStay homeStay,Jeeps jeeps)
	{
	
	this.view=view;
	this.homeStay=homeStay;
	this.jeeps=jeeps;
	}
	public void display()
	{
		System.out.println(Kodachadri.place);
		System.out.println(this.view);
		System.out.println(this.homeStay);
		System.out.println(this.jeeps.phoneNo);
		System.out.println(this.jeeps.price);
	}
}
