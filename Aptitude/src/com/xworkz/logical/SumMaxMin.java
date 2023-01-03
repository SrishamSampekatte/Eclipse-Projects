package com.xworkz.logical;

import java.util.*;

public class SumMaxMin {

	static void minMax(int[] arr) {
		long minValue = 0;
		long maxValue = 0;
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0, j = n - 1; i < n - 1; i++, j--) {

			minValue += arr[i];
			maxValue += arr[j];

		}
		System.out.println("MinValue is: " + minValue + " MaxValue is: " + maxValue);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 10, 5, 4, 2, 8, 9, 1, 6, 15 };
		minMax(arr);
	}

}
