package lastoccur;
import java.util.*;

public class Romantoint {
	static void romanToInt(String str){
		int sum=0;
		int curr=0;
		int pre=0;
		
		for(int i=str.length()-1; i>=0; i--) {
		
			curr= getvalue(str.charAt(i));
			if(curr<pre){
			sum-=curr;
			}
			else {
				sum+=curr;
			}
			
			pre=curr;
		}
		System.out.println(sum);
		
		
	}
static int getvalue(char c) {
		int val=0;
		switch(c) {
		case 'I':
			val= 1;
			break;
		
		case 'V':
			val= 5;
			break;
		
		case 'X':
			val=  10;
			break;
		
		case 'L':
			val=  50;
			break;
		
		case 'C':
			val=  100;
			break;
		
		case 'D':
			val=  500;
			break;
		
		case 'M':
			val=  1000;
			break;
		}
		return val;
	}
	
	


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 String str=sc.next();
		
		romanToInt(str.toUpperCase());
		
//		System.out.print(result);
		
	}

}
