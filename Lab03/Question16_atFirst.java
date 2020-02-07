package assignments.Lab03;

import java.util.Scanner;

public class Question16_atFirst {

	public static void main(String[] args) {
		/*
		 * Given a string, return a string length 2 made of its first 2 chars. 
		 * If the string length is less than 2, use '@' for the missing chars.
		 
		 * atFirst("hello") 	→ "he"
		 * atFirst("hi") 		→ "hi"
		 * atFirst("h") 		→ "h@"
		 */

	System.out.println(atFirst());
	
	}

	public static String atFirst() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a word to check first two characters :");
			String word = input.nextLine();
			
		if (word.length()>=2) {
			return word.substring(0, 2);
		
		}else if (word.length()==1) {
			return word.concat("@");
			
		}else {
			return "@@";
		}
	}
}
