package com.xworkz.logical;

public class Vowels {

	public static void main(String[] args) {
		
			String name="Hello";
			int vCount=0;
			name=name.toLowerCase();
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||
						name.charAt(i)=='o'||name.charAt(i)=='u') {
					vCount++;
				}
				else if(name.charAt(i)>='a'&&name.charAt(i)<='z') {
					;
				}
			}
			System.out.println("Vowels-"+vCount);
			//System.out.println("Consonents-"+cCount);
		}

	}


