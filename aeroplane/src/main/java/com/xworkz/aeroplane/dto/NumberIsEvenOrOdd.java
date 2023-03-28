package com.xworkz.aeroplane.dto;

import java.util.Iterator;
import java.util.Scanner;

public class NumberIsEvenOrOdd {
public NumberIsEvenOrOdd() {
	System.out.println("Running ...");
}
	public static void main(String[] args) {
		
		int [] numbers= {1,2,3,4,5};
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter an nteger");
		//x=sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]+"is even number");
			}else {System.out.println(numbers[i]+"is odd number");}
		}

	}

}
