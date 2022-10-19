package com.xworkz.variables;

public class Home {
	
	public String name;
	public int noOfRooms;
	public int noOfSharing;
	public String ownerName;
	public boolean worth;
	public String[] BreakFast;
	public String[] Lunch;
	public String[] Dinner;
	public String[] Facilities;
	public String[] Roomies;
	public String[] Catagory;
	
	
	
	public Home(String name,int noOfRooms, int noOfSharing,String ownerName,boolean worth,String[]BreakFast,String[]Lunch,String[]Dinner,String[]Facilities,String[]Roomies,String[]Catagory)
	{
		this.name=name;
		this.noOfRooms=noOfRooms;
		this.noOfSharing=noOfSharing;
		this.ownerName=ownerName;
		this.worth=worth;
		this.BreakFast=BreakFast;
		this.Lunch=Lunch;
		this.Dinner=Dinner;
		this.Facilities=Facilities;
		this.Roomies=Roomies;
		this.Catagory=Catagory;
		
	}
	 
		public void Display() 
		{
			System.out.println(this.name);
			System.out.println(this.noOfRooms);
			System.out.println(this.noOfSharing);
			System.out.println(this.ownerName);
			System.out.println(this.worth);
			for (int i = 0; i < BreakFast.length; i++) {
				String string = BreakFast[i];
				System.out.println(string);
			}
			for (int i = 0; i < Lunch.length; i++) {
				String string = Lunch[i];
				System.out.println(string);
			}
			for (int i = 0; i < Dinner.length; i++) {
				String string = Dinner[i];
				System.out.println(string);
			}
			
			for (int i = 0; i < Facilities.length; i++) {
				String string = Facilities[i];
				System.out.println(string);
			}
			for (int i = 0; i < Roomies.length; i++) {
				String string = Roomies[i];
				System.out.println(string);
			}
			
			for (int i = 0; i < Catagory.length; i++) {
				String string = Catagory[i];
				System.out.println(string);
			}
			
		}

}
