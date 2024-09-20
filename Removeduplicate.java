package removeduplicate;

import java.util.*;

public class Removeduplicate {
    static ArrayList<Integer> removeDuplicate(int arr[], int n, int arr2[]) {
    	ArrayList<Integer> res=new ArrayList<Integer>();
    	for(int i=0; i<n; i++) {
    		arr2[arr[i]]=1;
    		
    	}
    	for(int i=0; i<n;i++){
    	if(arr2[i]==1) {
    		res.add(i);
    		
    	}
    	}
        return res;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> res=removeDuplicate(arr,n,arr2);
		System.out.print(res);
		sc.close();
	}
}
