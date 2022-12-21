package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		Collection<Integer> shoeSize = new ArrayList<Integer>();
		shoeSize.add(1);
		shoeSize.add(2);
		shoeSize.add(3);
		shoeSize.add(4);
		shoeSize.add(5);
		shoeSize.add(6);
		shoeSize.add(7);
		shoeSize.add(8);
		shoeSize.add(9);
		shoeSize.add(10);
		shoeSize.add(11);
		shoeSize.add(12);
		shoeSize.add(13);
		shoeSize.add(14);
		shoeSize.add(15);

		System.out.println(shoeSize.size());

		for (Integer element : shoeSize) {
			System.out.println(element);
		}
		System.out.println(" ");
		System.out.println(" Using Iterator to use while loop ");

		Iterator<Integer> element = shoeSize.iterator();
		while (element.hasNext()) {

			Integer reference = element.next();
			System.out.println(reference);
		}

	}
}
