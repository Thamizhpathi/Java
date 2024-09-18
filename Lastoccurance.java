package lastoccur;

import java.util.*;

//this code will find last occurance of an element
//what do you want to search in an array 

public class Lastoccurance {

	static void lastOccurance(int n, int arr[], int s) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (s == arr[i]) {
				res = i;
			}
		}
		if (res > 0) {
			System.out.print("last Occuranc: " + res);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of an array : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search: ");
		int element = sc.nextInt();

		lastOccurance(n, arr, element);

	}
}
