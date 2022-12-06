package logics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		
		int rem=0;
		System.out.print("Enter an Integer");
		x=sc.nextInt();
		while (x>0) {
		rem=x%10;
		
		if(rem%2==0) {
			System.out.println("Number is even" +rem);
		}
		else {
			System.out.println("number is odd"+rem);
		}x=x/10;
		
		}
	}

}
