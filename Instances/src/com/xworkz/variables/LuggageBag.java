package com.xworkz.variables;

public class LuggageBag {
	public String bagName;
	public String[] color;
	public int[] price;
	public int[] noOfSeperaters;
	public boolean travel;
	public String[] type;
	public String[] differentBagNames;
	public int[] noOfZips;
	public boolean toCarryItems;
	
	public LuggageBag(String bagName,String[] color,int[] price,int[] noOfSeperaters,boolean travel,String[] type,String[] differentBagNames ,int[] noOfZips,boolean toCarryItems){
		this.bagName=bagName;
		this.color=color;
		this.price=price;
		this.travel=travel;
		this.type=type;
		this.differentBagNames=differentBagNames;
		this.noOfZips=noOfZips;
		this.toCarryItems=toCarryItems;
	}
	

public void display() {

	System.out.println(this.bagName);
	System.out.println(this.travel);
	System.out.println(this.toCarryItems);

	
	for (int i = 0; i < color.length; i++) {
		String string = color[i];
		System.out.println(string);
	}
	for (int i = 0; i < price.length; i++) {
		int string = price[i];
		System.out.println(string);
	}
	for (int i = 0; i < noOfSeperaters.length; i++) {
		int string = noOfSeperaters[i];
		System.out.println(string);
	}
	for (int i = 0; i < type.length; i++) {
		String string = type[i];
		System.out.println(string);
	}
	for (int i = 0; i < differentBagNames.length; i++) {
		String string = differentBagNames[i];
		System.out.println(string);
	}
	for (int i = 0; i <  noOfZips.length; i++) {
		int string =  noOfZips[i];
		System.out.println(string);
	}
}



}
