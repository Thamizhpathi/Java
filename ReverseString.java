package reversesentence;

import java.util.*;

//Reverse the Words in the String without change the order the word 
//1.Get Sentence from the user 
//2.iterate the for loop until the string (len-1) 
//3.Inside the loop check where the space is occuring if (!'') add a char to word string 
//4. whent the space occuring the else part send a word to the reverse funtion 
//5. In the reverse function using the for loop reverse the word and return as a string to main function
//		main function store the reversed word one by one into the reverse variable 
//6. finally it will print the reversed senctence once the main for loops came to end 		

public class ReverseString {
	static String reverse(String word) {
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String");
		String Original = sc.nextLine();
		String Reverse = "";
		String Word = "";

		for (int i = 0; i <= Original.length() - 1; i++) {
			if (i == Original.length() - 1) {
				Word += Original.charAt(i);
				Reverse += reverse(Word) + " ";
				Word = "";
			}
			if (Original.charAt(i) != ' ') {
				Word += Original.charAt(i);
			} else {
				Reverse += reverse(Word) + " ";
				Word = "";

			}
		}
		System.out.print(Reverse);

	}

}
