package assignments.Lab03;

import java.util.Scanner;

public class Question13_doubleChar {

	public static void main(String[] args) {
		/*
		 * Given a string, return a string where for every char in the original, 
		 * there are two chars.
		 
		 * doubleChar("The") →"TThhee"
		 * doubleChar("AAbb") →"AAAAbbbb"
		 * doubleChar("Hi-There") →"HHii--TThheerree"
		 */

		doubleChar();
	}

	public static void doubleChar() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a string :");
			String word = input.nextLine();
			
		int n = word.length();
		String doubleLetter = "";
		
		
		for (int i = 0;    i<=n-1;  i++) {
			
			doubleLetter = doubleLetter + word.substring(i,i+1).concat(word.substring(i,i+1));
				
			}
		
	System.out.println(doubleLetter);
		
	}
}

