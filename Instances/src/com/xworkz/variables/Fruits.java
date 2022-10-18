package com.xworkz.variables;

public class Fruits {
	
		public String name;
		public String keptin;
		public int noOfFruits;
		public String favtFruit;
		public boolean healthy;
		public String[] Fruit;
		public double[] nums;
		public String[] color;
		public String[] vitamins;
		public double[] price;
		public String[] dryFruits;
		
		
		
		public Fruits (String name,String keptin,int noOfFruits,String favtFruit,boolean healthy,String[] Fruit,double[] nums,String[] color,String[] vitamins,double[] price,String[] dryFruits)
		{
			this.name=name;
			this.keptin=keptin;
			this.noOfFruits=noOfFruits;
			this.favtFruit=favtFruit;
			this.healthy=healthy;
			this.Fruit=Fruit;
			this.nums=nums;
			this.color=color;
			this.vitamins=vitamins;
			this.price=price;
			this.dryFruits=dryFruits;
			
		}
		 
			public void Display() 
			{
				System.out.println(this.name);
				System.out.println(this.keptin);
				System.out.println(this.noOfFruits);
				System.out.println(this.favtFruit);
				System.out.println(this.healthy);
				for (int i = 0; i < Fruit.length; i++) {
					String string = Fruit[i];
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
