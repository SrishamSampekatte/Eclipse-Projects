package com.xworkz.variables.boot;

import com.xworkz.variables.Fruits;

public class FruitsRunner {

	public static void main(String[] args) {
		String[] Fruit= {"Grapes","Orange","Banana","JackFruit"};
		double[] nums= {1,2,3,4,5.5};
		String[] color= {"Green","Orange","Yellow","Red"};
		String[] vitamins= {"A","B","C","D"};
		double[] price= {80,65,75,25};
		String[] dryFruits= {"Cashew","Kaaju","Dates"};
		
	Fruits fruits=new Fruits("Hannu","Bucket",6,"Jack",true,Fruit,nums,color,vitamins,price,dryFruits);
		
		fruits.Display();
		

	}

}
