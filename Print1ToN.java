package print1ToN;

import java.util.*;

//using Recursive method print 1 to N Numbers 


public class Print1ToN {
	static void printNos(int N) {

		if (N == 0) {
			return;
		}
		printNos(N - 1);
		System.out.print(N + " ");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of N: ");
		int N = sc.nextInt();

		printNos(N);
	}
}
