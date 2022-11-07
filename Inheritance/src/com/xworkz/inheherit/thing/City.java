package com.xworkz.inheherit.thing;

public class City extends Capital {

	public void methodCity() {
		System.out.println("Printing City");

		City city = new City();

		Object object = new Object();
		Place place = new Place();
		Capital capital = new Capital();
		
		
		Object place2=new Place();
		Place capital2=new Capital();
		Object capital3=new Capital();
		
		Capital city2=new City();
		Place city3=new City();
		Object city4=new City();
	}
}
