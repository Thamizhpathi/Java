package lastoccur;
import java.util.*;
public class ArrayTranspose {
	
	
//Rotating the Array 
static void arrayTranspose(int arr[][], int n) {
	int at[][]=new int[n][n];
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			at[i][j]=arr[j][i];
		}
		
	}
	System.out.println("Array Transpose");
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
		System.out.print(at[i][j]+" ");
			
		}
		System.out.println();
	}
	System.out.println("-----------------------------");
	arrayReverse(at,n);
}



//Revese the array
	static void arrayReverse(int arr[][], int n) {
		int reversingarr[][]=new int[n][n];
		int k=0;
		System.out.println("Reversing the Array");
		for(int i=0; i<n; i++) {
			k=0;
			for(int j=n-1; j>=0; j--) {
				reversingarr[i][k]=arr[i][j];
				k++;
			}
		
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(reversingarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	// Main funtion
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		arrayTranspose(arr,n);
	}

}
