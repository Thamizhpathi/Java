package lastoccur;

import java.util.Scanner;
import java.util.Stack;

//check weather is valid parantheses using stack
public class Validparantheses {

	static boolean isValidParantheses(String Parantheses) {
		Stack<Character> stk = new Stack<>();
		for (int i = 0; i < Parantheses.length(); i++) {
			if (Parantheses.charAt(i) == '(') {
				stk.push(Parantheses.charAt(i));
			} else {
				if (!stk.empty() && (stk.peek() == '(' && Parantheses.charAt(i) == ')')
						|| (stk.peek() == '[' && Parantheses.charAt(i) == ']')
						|| (stk.peek() == '{' && Parantheses.charAt(i) == '}')) {

					stk.pop();
				} else {

					return false;
				}

			}
		}
		return stk.empty();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String parantheses = sc.next();

		System.out.print(isValidParantheses(parantheses));
	}

}
