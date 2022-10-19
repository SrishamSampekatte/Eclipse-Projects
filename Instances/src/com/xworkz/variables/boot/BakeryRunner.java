package com.xworkz.variables.boot;

import com.xworkz.variables.Bakery;

public class BakeryRunner {

	public static void main(String[] args) {

				String[] Veg= {"Cucumber","Bitroot","Carrot","Radish"};
				double[] nums= {1,2,3,4,5.5};
				String[] color= {"Green","Red","Yellow","White"};
				String[] vitamins= {"A","B","C","D"};
				double[] price= {80,65,75,25};
				String[] dryFruits= {"Cashew","Kaaju","Dates"};
				
				Bakery bake=new Bakery("Hannu","Bucket",6,"Jack",true,Veg,nums,color,vitamins,price,dryFruits);
				
				bake.display();
				

			}

	}

