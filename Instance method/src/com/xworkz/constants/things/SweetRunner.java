package com.xworkz.constants.things;


public class SweetRunner {

	public static void main(String[] args) {
				
		Sweet sihi=new Sweet(1980);
		sihi.setPrice(45);
		sihi.location="Shivamogga";
		
		sihi.display();
		sihi.displayTotalPrice();

	}

}
