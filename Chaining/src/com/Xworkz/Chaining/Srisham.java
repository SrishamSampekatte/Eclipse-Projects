package com.Xworkz.Chaining;

public class Srisham 
{
	public String name;
	public int age;
	public String area;
	
	public Srisham() 
	{
		System.out.println("My Introduction");
		
	}
	public Srisham(String name) 
	{
		this.name=name;
		System.out.println("Created using String ");
	}
	public Srisham(int age,String name) 
	{
		this.age=age;
		this.name=name;
	}
	public Srisham(int age,String name,String area) 
	{
		this(age,name);
		this.area=area;
	} 
	
}
