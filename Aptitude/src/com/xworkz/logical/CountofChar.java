package com.xworkz.logical;

public class CountofChar {
public static void main(String[] args) {
		
		String name = "God is great and great full to him";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total Count-"+count);

	}
}
