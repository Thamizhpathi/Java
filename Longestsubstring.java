package lastoccur;
import java.util.*;


// To find the longest substring
public class Longestsubstring {
	 static String longestSubString(String s1, String s2) {
		 int dp[][]=new int[s1.length()+1][s2.length()+1];
		 int maxlength=0;
		 int endindex=0;
		 for(int i=1; i<=s1.length(); i++) {
			 for(int j=1; j<=s2.length(); j++) {
				 if(s1.charAt(i-1)==s2.charAt(j-1)) {
					 dp[i][j]=dp[i-1][j-1]+1;
					 if(dp[i][j]>maxlength) {
						 maxlength=dp[i][j];
						 endindex=i;
					 }
					
				 }
			 }
			 
		 }
		 if(maxlength>0) {
			 return s1.substring(endindex-maxlength,endindex);
		 }
		 return "";
		 
	 }
	 static int sumOfSubString(String substring) {
		 int sum=0;
		 for(int i=0; i< substring.length(); i++) {
			 sum+=(int)substring.charAt(i);
		 }
		 return sum;
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		
		String substring= longestSubString(s1,s2);
	  int result=sumOfSubString(substring);
	  System.out.print(result);
	}

}
