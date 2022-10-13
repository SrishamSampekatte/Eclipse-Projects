package com.xworkz.constructor;

public class Boat 
{
	public String name;
	public String color;
	public String companyName;
	public String type;
	public String owner;
	
	public Boat()
	{
		System.out.println("Boaaaaaat");
	}
	


		
	public Boat(String name,String color,String companyName,String type,String owner) 
	{
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		this.type=type;
		this.owner=owner;
		
		System.out.println("Boat alli haadu keluva");
		
	}
}
