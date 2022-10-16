package com.Xworkz.Chaining.boot;
import com.Xworkz.Chaining.TextileShop;

public class TextileShopRunner {
	public static void main(String[] args) {
		TextileShop textile=new TextileShop("Batte angadi");
		System.out.println(textile);
		
		System.out.println(System.lineSeparator());
		TextileShop textile1=new TextileShop("Nishma",14);
		System.out.println(textile1.ownerDaughterName);
		System.out.println(textile1.shopNo);
		
		System.out.println(System.lineSeparator());
		TextileShop textile2=new TextileShop("Ramesh");
		System.out.println(textile2.ownerName);
		
		System.out.println(System.lineSeparator());
		TextileShop textile3=new TextileShop("Ramesh",9988774455f);
		System.out.println(textile3.ownerName);
		System.out.println(textile3.contactNo);
		
		System.out.println(System.lineSeparator());
		TextileShop textile4=new TextileShop("Ramesh",9988774455f,"Vima");
		System.out.println(textile4.ownerName);
		System.out.println(textile4.contactNo);
		System.out.println(textile4.ownerWifeName);
		
		System.out.println(System.lineSeparator());
		TextileShop textile5=new TextileShop("Ramesh",9988774455f,"Vima","Nishma");
		System.out.println(textile5.ownerName);
		System.out.println(textile5.contactNo);
		System.out.println(textile5.ownerWifeName);
		System.out.println(textile5.ownerDaughterName);
		
		System.out.println(System.lineSeparator());
		TextileShop textile6=new TextileShop("Ramesh",9988774455f,"Vima","Nishma",8877799654f);
		System.out.println(textile6.ownerName);
		System.out.println(textile6.contactNo);
		System.out.println(textile6.ownerWifeName);
		System.out.println(textile6.ownerDaughterName);
		System.out.println(textile6.ownerDaughterNumber);
		
		System.out.println(System.lineSeparator());
		TextileShop textile7=new TextileShop("Ramesh",9988774455f,"Vima","Nishma",8877799654f);
		System.out.println(textile7.ownerName);
		System.out.println(textile7.contactNo);
		System.out.println(textile7.ownerWifeName);
		System.out.println(textile7.ownerDaughterName);
		System.out.println(textile7.ownerDaughterNumber);
		
		System.out.println(System.lineSeparator());
		TextileShop textile8=new TextileShop("Ramesh",9988774455f,"Vima","Nishma",8877799654f,14);
		System.out.println(textile8.ownerName);
		System.out.println(textile8.contactNo);
		System.out.println(textile8.ownerWifeName);
		System.out.println(textile8.ownerDaughterName);
		System.out.println(textile8.ownerDaughterNumber);
		System.out.println(textile8.shopNo);
		
		System.out.println("Batte tagolana");
	}
}
