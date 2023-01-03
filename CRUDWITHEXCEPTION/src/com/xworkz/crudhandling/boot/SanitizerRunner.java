package com.xworkz.crudhandling.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.xworkz.crudhandling.dto.SanitzerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitzerDTO sanitzer1 = new SanitzerDTO(null, "Dettol", 109D, "Blue", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer2 = new SanitzerDTO(2, "Sterrillum", 675D, "Green", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer3 = new SanitzerDTO(3, "Savlon", 800D, "Pink", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer4 = new SanitzerDTO(null, "Lifebuoy", 376D, null, "Srisham", "SYSTEM");
		SanitzerDTO sanitzer5 = new SanitzerDTO(5, "Godrej", 208D, "Brown", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer6 = new SanitzerDTO(6, "Dabur", 65D, "Blue", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer7 = new SanitzerDTO(7, "Multani", 250D, "Red", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer8 = new SanitzerDTO(8, "Corvil", 620D, "Purple", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer9 = new SanitzerDTO(null, "Trust", 500D, "Orange", "Srisham", "SYSTEM");
		SanitzerDTO sanitzer0 = new SanitzerDTO(10, "DCM Shriram", 600D, "White", "Srisham", "SYSTEM");

		Collection<SanitzerDTO> collection = new LinkedList<SanitzerDTO>();
		collection.add(sanitzer1);
		collection.add(sanitzer2);
		collection.add(sanitzer3);
		collection.add(sanitzer4);
		collection.add(sanitzer5);
		collection.add(sanitzer6);
		collection.add(sanitzer7);
		collection.add(sanitzer8);
		collection.add(sanitzer9);
		collection.add(sanitzer0);

		Iterator<SanitzerDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			SanitzerDTO element = itr.next();
			 System.out.println(element);
			 if (element.getId() > 5) {
			 System.out.println(element.getBrand() + " Price is :" + element.getId());
			 }
		}

		Iterator<SanitzerDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			SanitzerDTO element = itr2.next();
			if (element.getId() == null || element.getBrand() == null || element.getColor() == null
					|| element.getPrice() == null) {
				System.out.println(element.getBrand() + " Is having null in the property");

			}
		}

		Iterator<SanitzerDTO> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			SanitzerDTO element = itr3.next();
			if (element.getColor() == "Green" || element.getColor() == "Red" || element.getColor() == "Blue") {
				itr3.remove();
				System.out.println(element.getBrand());

			}
		}
		Iterator<SanitzerDTO> itr4 = collection.iterator();
		while (itr4.hasNext()) {
			SanitzerDTO element = itr4.next();
			if (element.getPrice() > 675)
				System.out.println("Max  price " + element.getBrand() + " : " + element.getPrice());
			else if (element.getPrice() < 109)
				System.out.println("Least price " + element.getBrand() + " : " + element.getPrice());
			else if (element.getPrice() == 620)
				System.out.println("Second highest  price " + element.getBrand() + " : " + element.getPrice());
		}

	}
}
