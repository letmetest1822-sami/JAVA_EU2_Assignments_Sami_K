package assignments.Lab03;

import java.util.Scanner;

public class Question09_rotatedRight2 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a "rotated right 2" version 
		 where the last 2 chars are moved to the start. 
		 * The string length will be at least 2.
		 * right2("Hello") → "loHel"
		 * right2("java") → "vaja"
		 * right2("Hi") → "Hi"
		 */

		System.out.println(right2(null));
	}

	public static String right2(String str) {
		
		Scanner input = new Scanner (System.in);
			System.out.print(" Enter a string at least with two characters :");
			String word = input.nextLine();
		
		int n = word.length()-2;
			
		String converted = word.substring(n).concat(word.substring(0, n));
		
		return converted; 
		
	}
	
	
}
