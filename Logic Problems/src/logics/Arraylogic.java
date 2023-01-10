package logics;

public class Arraylogic {

	public static void main(String[] args) {
		int[] arrs = { 2, 3, 5, 6, 4, 7, 8, 10, 24, 45 };
		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] % 2 == 0) {
		System.out.println("odd number"+ arrs[i]);
			}else {
				System.out.println("even"+arrs[i]);
			} 
		}

	}

}
