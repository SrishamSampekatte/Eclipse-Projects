package com.xworkz.variables.boot;

import com.xworkz.variables.PayingGuest;

public class PayingGuestRunner {

	public static void main(String[] args) {
		String[] BreakFast= {"RiceBath","Dosa,","Idli","Tea"};
		String[] Lunch= {"Rice","Rasam"};
		String[] Dinner= {"Rice","Rasam","Chapati","palya"};
		String[] Facilities= {"WI-fI","Hot water"};
		String[] Roomies= {"Srisham","Aashu","Fahad"};
		String[] Catagory= {"Student","Work"};
		int noOfRooms=8;
		
		PayingGuest pg = new PayingGuest("Golden Villa",noOfRooms,3,"Bangarada Manushya",true,BreakFast,Lunch,Dinner, Facilities, Roomies, Catagory);
		
		pg.Display();
		
		
		

	}

}
