package secondlargest;

import java.util.*;

// Finding Second Largest element and its count 
// sort the array 

public class Slcount {
	static int sortt(int arr[], int n) {
		int temp;
		int sl = 0;
		int k = 0;
		int c = 0;
		Arrays.sort(arr);
//		for(int i=0; i<n; i++) {
//			for(int j=i+1; j<n; j++) {
//				if(arr[i]>=arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
//		}
		// find the second largest
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] < arr[n - 1]) {
				sl = arr[i];
				c++;
				k = i - 1;
				break;
			}
		}
		if (c == 0) {
			return 0;
		} else {
			for (int i = k; i >= 0; i--) {
				if (arr[i] == sl) {
					c++;
				}
			}
		}
		return --c;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sortt(arr, n));

		sc.close();

	}

}
