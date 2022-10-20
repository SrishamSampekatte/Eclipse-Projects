package com.xworkz.constants.enums.boot;
import com.xworkz.constants.enums.Kodachadri;
import com.xworkz.constants.HomeStay;
import com.xworkz.constants.Jeeps;

public class KodachadriRunner {

	public static void main(String[] args) {
		
		Kodachadri gudda=new Kodachadri("Hill Station",HomeStay.SRI_AMBIKA_HOME_STAY,Jeeps.JEEP_OWNER2);
		
		gudda.display();
	}

}
