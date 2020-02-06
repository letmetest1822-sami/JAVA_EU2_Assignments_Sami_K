package assignments.Lab03;

import java.util.Scanner;

public class Question10_frontAgain {

	public static void main(String[] args) {
		/*
		 * Given a string, return true if the first 2 chars in the string 
		 * also appear at the end of the string, such as with "edited".
		 
		 * frontAgain("edited") → true
		 * frontAgain("edit") → false
		 * frontAgain("ed") → true
		 */

		System.out.println(frontAgain());
	}

	public static boolean frontAgain() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter an at least 2 charactered String :");
			String word = input.nextLine();
			
				return ((word.substring(0,2)).equals(word.substring(word.length()-2)));
	}
}
