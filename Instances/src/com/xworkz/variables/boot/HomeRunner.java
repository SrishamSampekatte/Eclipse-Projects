package com.xworkz.variables.boot;

import com.xworkz.variables.Home;

public class HomeRunner {

	public static void main(String[] args) {
		String[] BreakFast= {"RiceBath","Dosa,","Idli","Tea"};
		String[] Lunch= {"Rice","Rasam"};
		String[] Dinner= {"Rice","Rasam","Chapati","palya"};
		String[] Facilities= {"WI-fI","Hot water"};
		String[] Roomies= {"Srisham","Abc","Bcd"};
		String[] Catagory= {"Student","Work"};
		int noOfRooms=8;
		
		Home home = new Home("Golden Villa",noOfRooms,3,"Bangarada Manushya",true,BreakFast,Lunch,Dinner, Facilities, Roomies, Catagory);
		
		home.display();

	}

}
