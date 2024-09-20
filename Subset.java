package subset;
import java.util.*;
public class Subset {
	static void checkSubset(int s1[],int s2[]) {
		
		int left=0; 
		
		for(int i=left; i<s1.length-1; i++) {
		 for(int j=0; j<s2.length-1; j++)	
			if(s1[i]==s2[j]) {
				left++;
			}
		}
		if(left>0) {
			System.out.print(left);
		}
		else {
			System.out.print("No common elements");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int s1[]=new int[n];
		int s2[]=new int[m];
		for(int i=0; i<n; i++) {
			s1[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			s2[i]=sc.nextInt();
		}
		
		checkSubset(s1,s2);
	}

}
