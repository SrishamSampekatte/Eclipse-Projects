package com.Xworkz.Chaining.boot;

import com.Xworkz.Chaining.Chain;

public class ChainRunner {

	public static void main(String[] args)
	{
		Chain chain=new Chain("iron");
		System.out.println(chain.type);
		
		Chain chainOne=new Chain("Iron",180.5);
		System.out.println(chainOne.type);
		System.out.println(chainOne.price);
		
		Chain chainTwo=new Chain("Iron",180.5,6);
		System.out.println(chainTwo.type);
		System.out.println(chainTwo.price);
		System.out.println(chainTwo.length);
		
		Chain chainThree=new Chain("Iron",180.5,6,"metal");
		System.out.println(chainThree.type);
		System.out.println(chainThree.price);
		System.out.println(chainThree.length);
		System.out.println(chainThree.material);
		
		Chain chainFour=new Chain("Iron",180.5,6,"metal",1.2);
		System.out.println(chainFour.type);
		System.out.println(chainFour.price);
		System.out.println(chainFour.length);
		System.out.println(chainFour.material);
		System.out.println(chainFour.weight);
		
		Chain chainFive=new Chain("Iron",180.5,6,"metal",1.2,false);
		System.out.println(chainFive.type);
		System.out.println(chainFive.price);
		System.out.println(chainFive.length);
		System.out.println(chainFive.material);
		System.out.println(chainFive.weight);
		System.out.println(chainFive.stolen);
		
		Chain chainSix=new Chain("Iron",180.5,6,"metal",1.2,false,"Cycle");
		System.out.println(chainSix.type);
		System.out.println(chainSix.price);
		System.out.println(chainSix.length);
		System.out.println(chainSix.material);
		System.out.println(chainSix.weight);
		System.out.println(chainSix.stolen);
		System.out.println(chainSix.usedFor);

		
		Chain chainSeven=new Chain("Iron",180.5,6,"metal",1.2,false,"Cycle",true);
		System.out.println(chainSeven.type);
		System.out.println(chainSeven.price);
		System.out.println(chainSeven.length);
		System.out.println(chainSeven.material);
		System.out.println(chainSeven.weight);
		System.out.println(chainSeven.stolen);
		System.out.println(chainSeven.usedFor);
		System.out.println(chainSeven.fresh);
		

	}

}
