package com.xworkz.logical;

public class SwitchCase {

	public static void main(String[] args) {

		int a = 10, b = 5;
		char n = '*'; // changes
		switch (n) {
		case '+':
			System.out.println("hi hello");

			System.out.println(a + b);
			break;
		case '-':
			System.out.println("hello every one");
			System.out.println(a - b);
			break;
		case '*':
			System.out.println("Hello humans");
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
		}

	}

}
