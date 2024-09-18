package anagrom;
import java.util.*;
public class Anogram {
	static void isAnogram(String s1, String s2) {s
		int alp[]=new int[26];
		String s3=s1.toUpperCase();
		String s4=s2.toUpperCase();
		for(int i=0; i<s1.length(); i++) {
			if(s3.charAt(i)>=65 && s3.charAt(i)<=90) {
				alp[s3.charAt(i)-65]+=1;
			}
		}
		System.out.println(Arrays.toString(alp));
		for(int i=0; i<s2.length(); i++) {
			if(s4.charAt(i)>=65 && s4.charAt(i)<=90) {
				alp[s4.charAt(i)-65]-=1;
			}
		}
		System.out.println(Arrays.toString(alp));
		if(Arrays.stream(alp).allMatch(x->x==0)) {
			System.out.print("true");
		   
		}
		else {
			System.out.println("false");
		}
		
	}
	public static void main(String[] args) {
		String s1="thamizhpathi";
		String s2="mipazhthhtia";
		
		
		isAnogram(s1,s2);
		
	}
}
