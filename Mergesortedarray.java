package lastoccur;
import java.util.*;

public class Mergesortedarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		for(int i=0; i<n; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			arr2[i]=sc.nextInt();
		}
		ArrayList<Integer> mergedArray=new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			mergedArray.add(arr1[i]);
		}
		for(int i=0; i<n; i++) {
			mergedArray.add(arr2[i]);
		}
		mergedArray.sort(null);
		System.out.print(mergedArray);
	}
}
