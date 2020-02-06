package assignments.Lab03;

import java.util.Scanner;

public class Question03_Times3 {

	public static void main(String[] args) {
		/*
		 * Create a method return a new string made of 3 copies of the last 2 chars of the original string.
		 * The string length will be at least 2.
		 * extraEnd("Hello") → "lololo"
		 * extraEnd("ab") → "ababab"
		 * extraEnd("Hi") → "HiHiHi"
		 */

		System.out.print(extraEnd(null));
	}

	public static String extraEnd(String str) {
		
		
			Scanner name = new Scanner (System.in);
			System.out.print("Enter a word : ");
			String word = name.nextLine();
							
			if (word.length()<2) {
				return "Invalid String";
			}
			
			String times3 = "";
			
			times3 = word.substring(word.length()-2);
		
			return times3+times3+times3;
		
	}
}
