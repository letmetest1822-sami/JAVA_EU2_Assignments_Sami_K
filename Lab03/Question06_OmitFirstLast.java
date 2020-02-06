package assignments.Lab03;

import java.util.Scanner;

public class Question06_OmitFirstLast {

	public static void main(String[] args) {
		/*
		 * Given a string, return a version without the first and last char, 
		 * so "Hello" yields "ell". 
		 * The string length will be at least 2.
		 * withoutEnd("Hello") 		→ "ell"
		 * withoutEnd("java") 		→ "av"
		 * withoutEnd("coding") 	→ "odin"
		 */

		System.out.println(withoutEnd());
		
	}

	public static String withoutEnd() {
		
		Scanner input = new Scanner (System.in);
			System.out.print(" Enter a string longer than two characters :");
			String word = input.nextLine();
		
		int n = word.length()-1;
		
		return word.substring(1, n); 
		
				
	}
}
