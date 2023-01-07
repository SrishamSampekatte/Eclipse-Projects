package logics;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMin {
	public static void main(String args[]) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		arrList.add(45);
		arrList.add(333);
		arrList.add(76);
		arrList.add(29);
		arrList.add(900);
		arrList.add(23);
		arrList.add(474);
		arrList.add(654);
		arrList.add(29);
		arrList.add(454);

		int n = arrList.size();

		System.out.println("Elements in the List are  :");

		for (Integer integer : arrList) {
			int max = Collections.max(arrList);
			System.out.println("Maximum number in list  : " + max);

			int min = Collections.min(arrList);
			System.out.println("Minimum numer in list  : " + min);

		}

	}
}
