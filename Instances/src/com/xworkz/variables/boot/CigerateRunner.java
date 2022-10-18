package com.xworkz.variables.boot;

import com.xworkz.variables.Cigerate;

public class CigerateRunner {

	public static void main(String[] args) {
		String[] brands= {"Lights","King"};
		String[] bestCmbo= {"Tea","Cofee"};
		int[] sizes= {1,2,3};
		String[] colors= {"White","Black"};
		String[] Smokepartners= {"X","Y"};
		double[]radius= {1,1.1,};
		
	Cigerate cigerate=new Cigerate("ITC","KingLights",3.2,"easily",true,brands,bestCmbo,sizes,colors,Smokepartners,radius);
	cigerate.Display();

	}

}
