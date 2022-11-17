package com.xworkz.logical;

public class UltaPyramid {
	public static int n = 4;

	public static void main(String[] args) {

		// main loop and first loop deals with rows and second loop deals with coloumns
		// i for rows
		// k for coloumn
		// j for space
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println(" ");

		}
		System.out.println("---------------");
		System.out.println(" Printing triangle / ");
		// main loop and first loop deals with rows and second loop deals with coloumns
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$ ");
			}
			System.out.println(" ");

		}
		System.out.println("--------------------------");

		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// for char add space to get equilateral
			for (int k = 1; k <= i; k++) {
				if (k != 2) {
					System.out.print(k);
				} else {
					System.out.print("Srisham");
				}
			}

			System.out.println(" ");

		}
		System.out.println("--------------------------");

		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// for char add space to get equilateral
			for (int k = 1; k <= i; k++) {
				if (k != 2) {
					System.out.print(k);
				} else {
					System.out.print("Srisham");
				}
			}

			System.out.println(" ");

		}

	}
}
