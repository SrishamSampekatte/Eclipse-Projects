package com.xworkz.variables;

public class Animals {
	public String []names;
	public String[] color;
	public int[] legs;
	public String[] food;
	public boolean livingThings;
	public String[] types;
	public String[] animalsNames ;
	public boolean breathing;
	
	public Animals(String[] names,String[] color,int[] legs, String[] food,boolean livingThings,String[] types,String[] animalsNames,boolean breathing) {
		this.names=names;
		this.color=color;
		this.legs=legs;
		this.food=food;
		this.livingThings=livingThings;
		this.types=types;
		this.animalsNames=animalsNames;
		this.breathing=breathing;
		
	}
	
	public void display() {
		System.out.println(this.breathing);
		
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < legs.length; i++) {
			long string = legs[i];
			System.out.println(string);
		}
		for (int i = 0; i < food.length; i++) {
			String string = food[i];
			System.out.println(string);
		}
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
			System.out.println(string);
		}
		for (int i = 0; i < animalsNames.length; i++) {
			String string = animalsNames[i];
			System.out.println(string);
		}
		
		
		
		
	}

}
