package com.xworkz.logical;

public class SquarePattern {

	public static void main(String[] args) {
		//printing square
		for (int i = 1; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				System.out.print(" @");
				
			}
			System.out.println(" @");
		}
		
		System.out.println(" ");
		// PRINTING NUMBERS 
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				System.out.print(i);
				
			}
			System.out.println(" ");
		}
		
		System.out.println();
		// numbers and text
		for (int i = 0; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				if (j==3){
				System.out.print(" S ");
				}
				else {
					System.out.print(" "+ i );
				}
			}
			System.out.println(" ");
		}
			System.out.println("=============================");
		/* 1    1    1 
		  text text text
		   1    1    1 */
		for (int i = 1; i <=3; i++) {
			for (int j = 0; j <=3; j++) {
				if (i==2){
				System.out.print(" Sri ");
				}
				else {
					System.out.print("   "+ i );
				}
			}
			System.out.println(" ");
		}
	}

}
