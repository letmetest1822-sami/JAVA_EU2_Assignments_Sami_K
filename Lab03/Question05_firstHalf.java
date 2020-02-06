package assignments.Lab03;

import java.util.Scanner;

public class Question05_firstHalf {

	public static void main(String[] args) {
		/*
		 * Given a string of even length, return the first half. 
		 * So the string "WooHoo" yields "Woo".
		 * firstHalf("WooHoo") → "Woo"
		 * firstHalf("HelloThere") → "Hello"
		 * firstHalf("abcdef") → "abc"
		 */

		System.out.println(firstHalf(null));
		
	}

	public static String firstHalf(String word1) {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter any string with a length of even number :");
			String word = input.nextLine();
			
			int n = ((word.length()/2));
					
			return word.substring(0, n);
	}
}
