package com.xworkz.logical;

public class Pyramid {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(" Sri ");
			}

			System.out.println(" ");
		}
		System.out.println(" ----------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" " + i);
			}

			System.out.println(" ");
		}
		System.out.println(" ---------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j=i; j <= 3; j++) {

				System.out.print(j);
			}

			System.out.println(" ");
		}

	}
}
