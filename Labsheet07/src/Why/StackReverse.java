package Why;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

	public static void main(String[] args) {
		String original = "Hello World";
		System.out.println("Original => "+original);
		System.out.println("Original => "+ reverseCharacter(original));

	}

	public static String reverseCharacter(String original) {
		Deque<Character> stack = new ArrayDeque<Character>();

		Deque<Character> letters = new ArrayDeque<Character>();
		for (int i = 0; i < original.length(); i++) {
			letters.add(original.charAt(i));

		}
		String reversed = "";
		while(!letters.isEmpty()) {
			reversed = reversed+ letters.pollLast();
		}
		return reversed;
		
	}

}
