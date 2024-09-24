package lastoccur;
import java.util.*;


//sum of Secondlargest in even position & secondsmallest in odd position


public class Slandss {
	static int Secondlargest(int arr[],int n){
		 ArrayList<Integer> result=new ArrayList<Integer>();
		 int sl=0;
		 for(int i=0; i<n; i++) {
			 if((i%2)==0) {
				result.add(arr[i]);
			 }
		 }
		 result.sort(null);
	 System.out.println(result);
		 for(int i=result.size()-1; i>=1;i--) {
			 if(result.get(i)>result.get(i-1)) {
				 sl=result.get(i-1);
				 break;
			 }
		 }
//		 System.out.println(sl);
		 return sl;
	}
	static int Secondsmallest(int arr[],int n){
		 ArrayList<Integer> result=new ArrayList<Integer>();
		 int ss=0;
		 
		 for(int i=0; i<n; i++) {
			 if((i%2)==1) {
				result.add(arr[i]);
			 }
		 }
		 result.sort(null);
		 System.out.println(result);
		 for(int i=0; i<=result.size()-2;i++) {
			 if(result.get(i)<result.get(i+1)) {
				 ss=result.get(i+1);
				 break;
			 }
		 }
//		 System.out.println(ss);
		 return ss;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		 int sl,ss;
//		 Secondlargest(arr,n);
		 sl=Secondlargest(arr,n);
		ss=Secondsmallest(arr,n);
		System.out.print("The sum of second largest and second smallest: "+ (sl+ss));
		sc.close();
	}

}
