package com.xworkz.variables.boot;

import com.xworkz.variables.Hostel;

public class HostelRunner {

	public static void main(String[] args) {

			String[] BreakFast= {"RiceBath","Dosa,","Idli","Tea"};
			String[] Lunch= {"Rice","Rasam"};
			String[] Dinner= {"Rice","Rasam","Chapati","palya"};
			String[] Facilities= {"WI-fI","Hot water"};
			String[] Roomies= {"Srisham","Aashu","Fahad"};
			String[] Catagory= {"Student","Work"};
			int noOfRooms=8;
			
			Hostel hostel = new Hostel("Golden Villa",noOfRooms,3,"Bangarada Manushya",true,BreakFast,Lunch,Dinner, Facilities, Roomies, Catagory);
			
			hostel.display();
			
			
			

		}

	}


