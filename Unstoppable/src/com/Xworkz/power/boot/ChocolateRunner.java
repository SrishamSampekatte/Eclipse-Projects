package com.Xworkz.power.boot;
import com.Xworkz.power.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) 
	{
		Chocolate sihi=new Chocolate();
		
		System.out.println(sihi.brand);
		System.out.println(sihi.name);
		System.out.println(sihi.flavor);
		System.out.println(sihi.price);
		
		sihi.brand="Nestle";
		sihi.name="DairyMilk";
		sihi.flavor="Chocolate";
		sihi.price=65;
		System.out.println("The Brand is "+sihi.brand);
		System.out.println("The name of the Chocolate is "+ sihi.name);
		System.out.println("Flavor of Chocolate is "+sihi.flavor);
		System.out.println("Cost of chocolate in Rs "+ sihi.price);
		
	

	}

}
