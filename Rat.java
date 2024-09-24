package lastoccur;

import java.util.*;

public class Rat {
	static int amountoffood(int a[],int n,int total) {
		int sum=0;
		int result=0;
		int i;
		for( i=0;i<n;i++) {
			sum=sum+a[i];
			if(sum>=total) {
//			    result=i+1;
			    break;
			}
		}
		return i+1;
	}
		
	
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int r=sc.nextInt();
	int unit=sc.nextInt();
	int total=r*unit;
	System.out.print(amountoffood(a,n,total));
	}
}
