package com.Xworkz.Chaining;

public class Tractor 
{
	public String name;
	public int price;
	public String color;
	public double hp;
	public String model;
	
	public Tractor()
	{
		System.out.println("Lets talk about Tractor");
	}
	
	public Tractor(String name)
	{
		this.name=name;
	}
	
	public Tractor(String name,double hp)
	{
		this.name=name;	
		this.hp=hp;
	}
	
	public Tractor(String name,double hp,int price)
	{
		this(name,hp);
		this.price=price;	
	}
	
	public Tractor(String name,int price,double hp,String color)
	{
		this(name,hp,price);
		this.color=color;	
	}
	
	public Tractor(String name,int price,String color,double hp,String model)
	{
		this(name,price);
		this.model=model;
		System.out.println("Hulime madok hogana");
	}
	
	
	

	
}
