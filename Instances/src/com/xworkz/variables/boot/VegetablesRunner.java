package com.xworkz.variables.boot;

import com.xworkz.variables.Vegetables;

public class VegetablesRunner {
	public static void main(String[] args) {
		String[] Veg= {"Cucumber","Bitroot","Carrot","Radish"};
		double[] nums= {1,2,3,4,5.5};
		String[] color= {"Green","Red","Yellow","White"};
		String[] vitamins= {"A","B","C","D"};
		double[] price= {80,65,75,25};
		String[] dryFruits= {"Cashew","Kaaju","Dates"};
		
		Vegetables vegetables=new Vegetables("Hannu","Bucket",6,"Jack",true,Veg,nums,color,vitamins,price,dryFruits);
		
		vegetables.display();
		

	}
}
