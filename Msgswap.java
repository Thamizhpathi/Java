package messageswap;

import java.util.*;

public class Msgswap {
	static String swap(String str, char ch1, char ch2) {
		int i = 0;
		String result = "";
		while (i < str.length()) {
			if (str.charAt(i) == ch1) {
				result += ch2;
			} else if (str.charAt(i) == ch2) {
				result += ch1;
			} else {
				result += str.charAt(i);
			}
			i++;
//			  System.out.println(result);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.print(swap(str, str.charAt(0), str.charAt(1)));

		sc.close();

	}

}
