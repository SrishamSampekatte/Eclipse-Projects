package logics;

import java.util.Scanner;

import sun.java2d.pipe.SpanClipRenderer;

public class EurekhaLogic {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();
		//System.out.println(start);
		//System.out.println(end);
		
		for(int i=start;i<=end;i++) {
			System.out.println(i);
			int temp=i;
			System.out.println(temp);
		}
	}

}
