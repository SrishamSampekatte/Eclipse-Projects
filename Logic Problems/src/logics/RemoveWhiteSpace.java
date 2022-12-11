package logics;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(), str2 = "";
		int noOfChar = 0;
		for (int i = 0; i < str.length(); i++) {
			// noOfChar++;
			if (str.charAt(i) == ' ') {
				continue;
			} else {
				str2 = str2 + str.charAt(i);
				noOfChar++;
			}
		}
		System.out.println(str2);
		System.out.println(noOfChar);
		
		System.out.println(" --------------------");
		
		String str="Hands on learning happens here";
		String s="";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				count+=1;
			}
			else {
				s+=ch;
			}
		}	
		System.out.println("white spaces:"+count);
		System.out.println("String without white space:"+s);
		
		
		
	}
	
	
	

}
