package logics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NonCommonElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n == m) {
			System.out.println("Length of two list must be different");
			return;
		}
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			list2.add(sc.nextInt());
		}
		Set<Integer> union = new HashSet<Integer>(list1);
		union.addAll(list2);
		Set<Integer> remove = new HashSet<Integer>(list1);
		remove.retainAll(list2);
		union.removeAll(remove);
		System.out.println(union.size());

	}
}