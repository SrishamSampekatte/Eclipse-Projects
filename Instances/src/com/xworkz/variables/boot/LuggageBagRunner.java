package com.xworkz.variables.boot;

import com.xworkz.variables.LuggageBag;

public class LuggageBagRunner {

	public static void main(String[] args) {
		String[] color={"white","red","blue","black","grey","silver"};
		int[] price={3000,3750,3800,3850,3900,3950};
		int[] noOfSeperaters = {1,2,3,4,5,6};
		String[] type= {"school bag","college bag","laptop bag","touriest bag","carry bag","hand bag"};
		String[] differentBagNames= {"skylee","dell","hp","wrong","metronaut"};
		int[] noOfZips= {2,3,4,5,6,1};
		
		LuggageBag luggagebag=new LuggageBag("VIP",color,price,noOfSeperaters,true,type,differentBagNames,noOfZips,true);
		luggagebag.display();

	}

}
