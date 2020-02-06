package assignments.Lab03;

import java.util.Scanner;

public class Question04_First2 {

	public static void main(String[] args) {
		/*
		 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
		 * If the string is shorter than length 2, return whatever there is, 
		 * so "X" yields "X", and 
		 * the empty string "" yields the empty string "". 
		 * firstTwo("Hello") 	→ "He"
		 * firstTwo("abcdefg") 	→ "ab"
		 * firstTwo("ab") 		→ "ab"
		 */

		System.out.print(firstTwo());

	}

	public static String firstTwo() {
		
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a word :");
			String word1 = input.nextLine();
			
			
			if (word1.length()<=2) {
				return word1;
			
			}else if (word1.isEmpty()) {
				return "";
			}
			else { 			
				return  word1.substring(0,2);
				
			}
	}
}
