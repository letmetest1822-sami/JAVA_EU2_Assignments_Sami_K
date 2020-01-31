package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question07_isPalindrome {

	public static void main(String[] args) {
		/*
		 * Complete a method isPalindrome() that will check if the number is a palindrome. 
		 * Print your result as a boolean (true or false).
		 * Do not convert int into a string!
			Example:
				input: 1001
				output: true

			Example:
				input: 1234
				output: false
		 */

		System.out.println(isPalindrome());
				
	}

	public static boolean isPalindrome() {
		
	
		Scanner number = new Scanner (System.in);
	
		System.out.print("Please enter a number : ");
	
		int a = number.nextInt();
		
		int b = a;
		
			if ( a == 0) {
				System.out.println("Please enter a number different from zero!");
			}
	
			int mirror = 0;
	
			while (a != 0) {
	
				int remaining = a % 10;
				mirror = mirror * 10 + remaining;
				a = a / 10;
			}
					if (b == mirror) {
					return true;
					}
			return false;
	}
}
