package logics;

import java.util.Scanner;

public class ReverseWords {
	// Java program to reverse a string
	// s = input()

	public static void main(String[] args) {
		String s[] = "sri sham".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}

		System.out.println(ans.substring(0, ans.length() - 1));

		// String ref=sc.nextString();
		String ref = "Srisham";
		StringBuilder builder = new StringBuilder();
		builder.append(ref);
		builder = builder.reverse();
		System.out.println(builder);

		String[] string = "Reverse String without using String builder method".split(" ");
		 //int chars = string.length;
		for (int i = string.length - 1; i >= 0; i--) {
			System.out.print(string[i] + " ");
		}
		

	}
}
