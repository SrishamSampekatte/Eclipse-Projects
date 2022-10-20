package com.xworkz.constants;

public enum Childrens {
	
	SL_SATHYA(62.1, "Electrical Superviser","KPTCL","Kasturi",2,"Hosanagara"),
	SL_SHANKAR(60.2,"AGM","L&T","Vatsala",1,"Bengaluru"),
	SLM_GIRI(58.3,"Teacher","GHPS Hosanadu","Sangeetha",2,"Sampekatte"),
	OKR(54.0,"Agricultrist","Bagavata","Savitha",2,"Otanadi"),
	SLS_GIRI(48.6,"Pandit","OwnBusiness","Asha",2,"Hosanagara"),
	SUBBANNA(46,"Senior Engineer","Wipro","Ramya",1,"Banglore");
	
	
	public double age;
	public String Proffession;
	public String company;
	public String wifeName;
	public int noOfChildren;
	public String settledAt;
	
	private Childrens(double age,String Proffession,String company,String wifeName,int noOfChildren,String settledAt) 
	{
		this.age=age;
		this.Proffession=Proffession;
		this.company=company;
		this.wifeName=wifeName;
		this.noOfChildren=noOfChildren;
		this.settledAt=settledAt;
	}

}
