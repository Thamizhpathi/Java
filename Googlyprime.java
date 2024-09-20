package googlyprime;
import java.util.*;

public class Googlyprime {
	static int isPrime(int sum) {
		for(int i=2; i<=sum/2; i++) {
			if(sum%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int rem;
		
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.print(isPrime(sum));
		sc.close();
	}

}
