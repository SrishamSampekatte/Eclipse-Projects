package logics;

public class NaturalNumAndCountThem {

	public static void main(String[] args) {
	int N=10;
	int sum=0;
	System.out.println("First "+N +"Numbers= ");
	 for(int i=1;i<=N;i++) {
		 System.out.println(i + " ");
		 sum+=i;
	 }
	 System.out.println();
	 System.out.println("Sum of first "+N  +"Natural Numbers"+sum);

	}

}
