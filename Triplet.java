package lastoccur;
import java.util.*;


public class Triplet {
	static void checksum(int arr[],int n, int val){
		
		int right =n-1;
//		System.out.print(right);
	for(int i=0; i<n; i++) {
		right =n-1;
		while(i<right) {
			if((arr[i]+arr[right])==val) {
				System.out.print(arr[i]+" "+ arr[right]);
			}
			right--;
//			System.out.print(right);
		}
		
//		System.out.print(i);
	}
	}
	static void threesum(int arr[],int n, int val) {
		int f1=arr[0];
		int f2=arr[1];
		
		int right=n-1;
		for(int i=2; i<n; i++) {
			right =n-1;
			
			while(i<=right) {

				if((f1+f2+arr[right])==val) {
					System.out.print(f1+" "+f2+" "+ arr[right]);
				}
				right--;

			}
			f1=f2;
			f2=arr[i];
			

		}
		
		
	}
		public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0; i<n; i++) {
			   arr[i]=sc.nextInt();
			   }
		 threesum(arr,n,20);
		   
		   
		}
}
