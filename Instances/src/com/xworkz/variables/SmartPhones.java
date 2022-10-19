package com.xworkz.variables;

public class SmartPhones {
	public String[] names= {"redmi","samsung","poco","oppo","vivo"};
	public int[] storage= {8,12,64,32,4};
	public String[] color= {"blue","black","white","grey","red"};
	public String[] RAM= {"128","64","128","128","64"};
	public double[] price= {1000.0,12000.3,15500.0,30000.0,40000.0};
	
	public String capacity;
	public String features;
	public String coverColor;
	public boolean type;
	public boolean battery;
	
	public SmartPhones(String capacity,String features,String coverColor,boolean type,boolean battery, String[] names,int[] storage,String[] color,String[] RAM,double[] price)
	{
		this.capacity=capacity;
		this.features=features;
		this.coverColor=coverColor;
		this.type=type;
		this.battery=battery;
		this.names=names;
		this.storage=storage;
		this.color=color;
		this.RAM=RAM;
		this.price=price;
	}
	public void display()
	{
		for (int i = 0; i < RAM.length; i++) {
			String string = RAM[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < storage.length; i++) {
			int string = storage[i];
			System.out.println(string);
	}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
			}
		for (int i = 0; i < price.length; i++) {
			double string = price[i];
			System.out.println(string);
			}

}
}