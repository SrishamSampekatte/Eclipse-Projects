package com.xworkz.constants.enums;

import com.xworkz.constants.HomeStay;
import com.xworkz.constants.Jeeps;


public class Kodachadri {
	
	public String place;
	public String view;
	public HomeStay homeStay=HomeStay.SRI_AMBIKA_HOME_STAY;
	public Jeeps jeeps=Jeeps.KARTHIK_GUDDEMANE;
	
	public Kodachadri(String place,String view,HomeStay homeStay,Jeeps jeeps)
	{
	this.place=place;
	this.view=view;
	this.homeStay=homeStay;
	this.jeeps=jeeps;
	}
	public void display()
	{
		System.out.println(this.place);
		System.out.println(this.view);
		System.out.println(this.homeStay);
		System.out.println(this.jeeps);
	}
}
