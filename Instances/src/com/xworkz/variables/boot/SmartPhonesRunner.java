package com.xworkz.variables.boot;

import com.xworkz.variables.SmartPhones;

public class SmartPhonesRunner {

	public static void main(String[] args) {
		String[] names= {"redmi","samsung","poco","oppo","vivo"};
		 int[] storage= {8,12,64,32,4};
		 String[] color= {"blue","black","white","grey","red"};
		 String[] RAM= {"128","64","128","128","64"};
		 double[] price= {1000.0,12000.3,15500.0,30000.0,40000.0};
		
			
	       SmartPhones index = new SmartPhones (names,storage,color,RAM,price,"samsung","good","white",true,true);
	      
	       
	       index.display();

	}

}
