package com.xworkz.constants.enums.boot;

import com.xworkz.constants.HomeStay;
import com.xworkz.constants.Jeeps;
import com.xworkz.constants.enums.Kodachadri;

public class KodachadriRunner {

	public static void main(String[] args) {
		
		Kodachadri gudda=new Kodachadri("Kodachadri","Hill Station",HomeStay.SRI_AMBIKA_HOME_STAY,Jeeps.KARTHIK_GUDDEMANE);
		
		gudda.display();
	}

}
