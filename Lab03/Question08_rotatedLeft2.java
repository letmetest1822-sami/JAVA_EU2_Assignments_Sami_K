package assignments.Lab03;

import java.util.Scanner;

public class Question08_rotatedLeft2 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a "rotated left 2" version 
		 where the first 2 chars are moved to the end. 
		 * The string length will be at least 2.
		 
		 * left2("Hello") → "lloHe"
		 * left2("java") → "vaja"
		 * left2("Hi") → "Hi"
		 */

		System.out.println(left2(null));
	}
	public static String left2(String str) {
	
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a string at least with 2 length :");
			String word = input.nextLine();
			
		String transformed = word.substring(2).concat(word.substring(0, 2));	
		
		return transformed;
}
}
