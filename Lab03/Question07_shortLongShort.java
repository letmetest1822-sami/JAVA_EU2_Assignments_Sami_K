package assignments.Lab03;

import java.util.Scanner;

public class Question07_shortLongShort {

	public static void main(String[] args) {
		/*
		 * Given 2 strings, a and b, return a string of the form short+long+short, 
		 * with the shorter string on the outside and the longer string on the inside. 
		 
		 * comboString("Hello", "hi") → "hiHellohi"
		 * comboString("hi", "Hello") → "hiHellohi"
		 * comboString("aaa", "b") → "baaab"
		 */

		Scanner input = new Scanner (System.in);
			System.out.print("Enter the First Word :");
			String word1 = input.nextLine();
		
			System.out.print("Enter the second Word :");
			String word2 = input.nextLine();
		
		System.out.print(comboString(word1, word2));	
	}

	public static String comboString(String word1, String word2) {
		
		String combo;
		
			if (word1.length()<word2.length()) {
				combo = word1.concat(word2).concat(word1);
				
			}else {
				combo = word2.concat(word1).concat(word2);
				  }
			
		return combo;
	}
}	
