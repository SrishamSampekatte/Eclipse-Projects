package com.xworkz.constants.enums;

import com.xworkz.constants.Childrens;

public class FamilyTree {
	public static String famName="Sri Sunka";
	public String name;
	public String place;
	public int noOfWife;
	public Childrens childrens;
	
	
	public FamilyTree(String name,String place,int noOfWife,Childrens childrens)
	{
		this.name=name;
		this.place=place;
		this.noOfWife=noOfWife;
		this.childrens=childrens;
		
	}
	
	public void vamshavruksha() {
		System.out.println(FamilyTree.famName);
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.noOfWife);
		
		System.out.println(this.childrens.age);
		System.out.println(this.childrens.company);
		System.out.println(this.childrens.Proffession);
		System.out.println(this.childrens.wifeName);
		System.out.println(this.childrens.noOfChildren);
		System.out.println(this.childrens.settledAt);
		
	}
	

}
