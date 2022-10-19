package com.xworkz.variables;

public class Vegetables {
	public String name;
	public String tray;
	public int noOfVeg;
	public String favtVeg;
	public boolean healthy;
	public String[] Veg;
	public double[] nums;
	public String[] color;
	public String[] vitamins;
	public double[] price;
	public String[] dryFruits;
	
	
	
	public Vegetables (String name,String tray,int noOfVeg,String favtVeg,boolean healthy,String[] Veg,double[] nums,String[] color,String[] vitamins,double[] price,String[] dryFruits)
	{
		this.name=name;
		this.tray=tray;
		this.noOfVeg=noOfVeg;
		this.favtVeg=favtVeg;
		this.healthy=healthy;
		this.Veg=Veg;
		this.nums=nums;
		this.color=color;
		this.vitamins=vitamins;
		this.price=price;
		this.dryFruits=dryFruits;
		
	}
	 
		public void display() 
		{
			System.out.println(this.name);
			System.out.println(this.tray);
			System.out.println(this.noOfVeg);
			System.out.println(this.favtVeg);
			System.out.println(this.healthy);
			for (int i = 0; i < Veg.length; i++) {
				String string = Veg[i];
				System.out.println(string);
			}
			for (int i = 0; i < nums.length; i++) {
				double string = nums[i];
				System.out.println(string);
				
			}
			for (int i = 0; i < vitamins.length; i++) {
				String string = vitamins [i];
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
			
			for (int i = 0; i < dryFruits.length; i++) {
				String string = dryFruits[i];
				System.out.println(string);
			}
			
		}


}
