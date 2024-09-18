package sumofmaxandmin;

import java.util.*;

// code find and minimum and maximum value using recursin 
//once find the min and max value sum it and print the result

public class sumofmaxandmin {
	static int findMax(int n, int arr[], int max) {

		if (n < 0) {
			return max;
		}
		if (arr[n] > max) {
			max = arr[n];
		}
		return findMax(n - 1, arr, max);
	}

	static int findMin(int m, int arr[], int min) {

		if (m < 0) {
			return min;
		}
		if (arr[m] < min) {
			min = arr[m];
		}
		return findMin(m - 1, arr, min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();

		int arr2[] = new int[m];

		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		int max = findMax(n - 1, arr, Integer.MIN_VALUE);
		int min = findMin(m - 1, arr2, Integer.MAX_VALUE);
		System.out.print(max + min);
	}
}
