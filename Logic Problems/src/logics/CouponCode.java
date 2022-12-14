package logics;

import java.util.Scanner;

public class CouponCode {

	// EH202265D

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coupon = sc.next();
		int count = 0;

		String str1 = coupon.substring(0, 2);
		System.out.println(str1);

		String str2 = coupon.substring(2, 6);
		System.out.println(str2);

		String str3 = coupon.substring(6, 9);
		System.out.println(str3);

		// int convertString=Integer.parseInt(str2);
		// System.out.println(convertString);

		int convertString = Integer.valueOf(str2);
		// System.out.println(str2);

		if (coupon.length() == 9 && convertString >= 2000 && convertString >= 2022) {
			if (str3.charAt(str3.length() - 1) >= 'A' && str3.charAt(0) <= 'Z') {
				if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z') {
					count++;
				}

			}

		}
		if(count==0) {
			System.out.println("Invalid coupon");
		}
		else {
			System.out.println("valid coupon");
		}
	}

}
