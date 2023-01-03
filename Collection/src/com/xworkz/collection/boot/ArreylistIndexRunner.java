package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;

public class ArreylistIndexRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("z");
		list.add("X");
		
	

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("-----------------");
		
		
		list.set(0, "S");
		list.set(1, "R");
		list.set(2, "I");
		list.set(3, "S");
		list.set(4, "H");
		list.set(5, "A");
		list.set(6, "M");
		list.remove("z");
		list.remove(7);
		
		

		// list.remove("A");
		// list.remove(1);

		list.get(3);
		for (String string1 : list) {
			
			System.out.println(string1);
			
			//System.out.println("-------------");
			//System.out.println(list.get(3));

		}
		
		System.out.println("------------------------");

	}

}
