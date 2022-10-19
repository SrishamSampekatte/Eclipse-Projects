package com.xworkz.variables.boot;

import com.xworkz.variables.Animals;

public class AnimalsRunner {

	public static void main(String[] args) {
		String[] names={"dog","lion","cheeta","tiger","cat","monkey"};
		String[] color={"white","red","blue","black","grey","silver"};
		int[] legs= {1,2,4,5,6,7,8};
		String[] food= {"meat","water","uta","grass"};
		String[] types= {"wild","humans","birds","domestic"};
		String[] animalsNames={"human","birds","wild"};
		
		
		
		Animals animals =new Animals(names,color,legs,food,true,types,animalsNames,true);
		animals.display();
		

	}

}
