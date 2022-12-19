package logics;

import java.lang.Math.*;

public class testcase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int s=150;
	long sumOdd=0;
	long sumEven=0;
	for (int n = 0; n <=s; n++) {
		long pn =( n * (3*n - 1) / 2);
		if(pn >= s) {
			break;
		}
		if(n % 2 == 1) {
			sumOdd += pn;
		} else {
			sumEven += pn; 
		}
		
	}
	long result = Math.abs(sumOdd - sumEven);
	//System.out.println(result);
return;
	}

}
