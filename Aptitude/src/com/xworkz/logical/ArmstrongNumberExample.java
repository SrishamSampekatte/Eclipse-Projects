package com.xworkz.logical;

import java.util.Scanner;

public class ArmstrongNumberExample {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the limit: "); // reads the limit from the user
		num = sc.nextInt();

		System.out.println("Armstrong Numbers are: ");
		String armstrongNumbers = "";

		for (int i = 0; i <= num; i++) {
			if (isArmstrong(i)) {
				armstrongNumbers = armstrongNumbers + i + ", ";
			}
		}

		armstrongNumbers = armstrongNumbers.substring(0, armstrongNumbers.length() - 2);
		System.out.println(armstrongNumbers);
	}

	public static boolean isArmstrong(int n) {
		int originalNumber, remainder, result = 0;
		int noOfDigits = 0;
		originalNumber = n;

		while (originalNumber != 0) {
			originalNumber /= 10;
			++noOfDigits;
		}

		originalNumber = n;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, noOfDigits);
			originalNumber /= 10;
		}

		if (result == n) {
			return true;
		}
		return false;
	}
}
