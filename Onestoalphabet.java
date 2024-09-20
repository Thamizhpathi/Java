package binarycon1;

import java.util.*;

public class Onestoalphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		String word = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - 48 != 0) {
				count++;

			} else {
				if (count > 0) {
					word += String.valueOf((char) (64 + count));
				}
				count = 0;
			}
		}
		if (count > 0) {
			word += String.valueOf((char) (64 + count));
		}
		System.out.print(word);
	}

}
