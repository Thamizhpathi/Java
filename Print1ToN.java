package print1ToN;

import java.util.*;

//using Recursive method print 1 to N Numbers in Ascending order and Descending order


public class Print1ToN {
	static void printNos(int N) {

		if (N == 0) {
			return;
		}
		printNos(N - 1);
		System.out.print(N + " ");

	}
	 static void printNosReverese(int N) {
	        // code here
	        if(N==0){
	            return;
	        }
	        System.out.print(N+" ");
	        printNosReverese(N-1);
	        
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of N: ");
		int N = sc.nextInt();

		printNos(N);
		System.out.println();
		printNosReverese(N);
	}
}
