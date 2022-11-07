package com.xworkz.inheherit.boot;


import com.xworkz.inheherit.child.Cardio;
import com.xworkz.inheherit.child.Dentist;
import com.xworkz.inheherit.child.ENT;
import com.xworkz.inheherit.thing.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {
		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.specilisation);
		System.out.println(" ");
		
		Dentist dentist=new Dentist();
		System.out.println(dentist.name);
		System.out.println(dentist.specilisation);
		System.out.println(" Above two are properties of Doctor/Parent class");
		System.out.println(dentist.age);
		System.out.println(dentist.location);
		System.out.println("Above 2 are properties of dentist");
		
		System.out.println(" Now im casting below i.e, calling properties of parent class in child class ");
		Doctor doc=(Dentist)dentist;
		System.out.println(doc.name);
		System.out.println(doc.specilisation);
		System.out.println(" ");
		
		ENT ent=new ENT();
		System.out.println(ent.colg);
		System.out.println(ent.experience);
		Doctor doc1=(ENT)ent;//casting 
		System.out.println(doc1.name);
		System.out.println(doc1.specilisation);
		System.out.println(" ");
		
		Cardio cardio=new Cardio();
		System.out.println(cardio.hospitalName);
		System.out.println(cardio.specilisation);
		System.out.println(" below im casting it ");
		Doctor carDoc=(Cardio)cardio;
		System.out.println(cardio.name);
		System.out.println(cardio.specilisation);
		System.out.println(carDoc.name);
		
	
	}

}
