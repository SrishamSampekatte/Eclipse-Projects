package com.Xworkz.Chaining;

public class Chain {
	public String type;
	public double price;
	public double length;
	public String material;
	public double weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;
	
	public Chain()
	{
		System.out.println("Chain drive alli cycle odsana");   
	}
	public Chain(String type)
	{
		this.type=type;
	}
	public Chain(String type,double price)
	{
		this.type=type;
		this.price=price;
	}
	public Chain(String type,double price,double length)
	{
		this(type,price);
		this.length=length;
	}
	public Chain(String type,double price,double length,String material)
	{
		this(type,price,length);
		this.material=material;
	}
	public Chain(String type,double price,double length,String material,double weight)
	{
		this(type,price,length,material);
		this.weight=weight;
	}
	public Chain(String type,double price,double length,String material,double weight,boolean stolen)
	{
		this(type,price,length,material,weight);
		this.stolen=stolen;
	}
	public Chain(String type,double price,double length,String material,double weight,boolean stolen,String usedFor)
	{
		this(type,price,length,material,weight,stolen);
		this.usedFor=usedFor;
	}
	public Chain(String type,double price,double length,String material,double weight,boolean stolen,String usedFor,boolean fresh)
	{
		this(type,price,length,material,weight,stolen,usedFor);
		this.fresh=fresh;
		System.out.println("Chain hakond cycle odsana");
		
		
	}

		
}

