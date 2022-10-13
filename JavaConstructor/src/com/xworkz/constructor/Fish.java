package com.xworkz.constructor;

public class Fish 
{
	public String name;
	public String type;
	public double price;
	public int weight;
	public double length;
	
	public Fish() 
	{
		System.out.println("Meenu neerinallide");
	}
	
	public Fish(String name,String type) 
	{
		this.name=name;
		this.type=type;
	}
	
	public Fish(double price,double length) 
	{
		this.price=price;
		this.length=length;
	}	
	
	public Fish(int weight) 
	{
		this.weight=weight;
	}
	
	public Fish(String name,int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	public Fish(double price, int weight) 
	{
		this.price=price;
		this.weight=weight;	
	}
	public Fish(String name,double length)
	{
		this.name=name;
		this.length=length;
	}
	
	public Fish(String name,String type,double price,double length,int weight) 
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.length=length;
		this.weight=weight;
		
		System.out.println("neerininda nelakke bantu");
	}
	
	
}
