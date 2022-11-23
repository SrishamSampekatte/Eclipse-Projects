package com.xworkz.equal.boot;
import com.xworkz.equal.thing.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		Lipstick lipstick = new Lipstick("mat",350,"huda","pink",true,"Ashika","new","bengaluru","Red Bull","xyz");
		System.out.println(lipstick);



		Lipstick lipstick2 = new Lipstick("mat",350,"huda","pink",true,"Ashika","new","bengaluru","Red Bull","xyz");
		System.out.println(lipstick2);


		boolean same7 = lipstick.equals(lipstick2);
		System.out.println(same7);

	}

}
