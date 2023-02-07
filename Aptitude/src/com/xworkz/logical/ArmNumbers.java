package com.xworkz.logical;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArmNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> armstrongNumbers = generateArmstrongNumbers(n);
		System.out.println("Armstrong Numbers are:" + armstrongNumbers.toString());
	}

public static boolean isAmstrong (int number){

int num= number;

int length =String.valueOf(num).length();

int sum=0;
while(num>0){

int lastDigit=num%10;

sum+=Math.pow(lastDigit, length);
num=num/10;
}

return sum == number;

}



















