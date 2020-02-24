package assignments.Assignment09;

import java.util.Scanner;

class Question07_halfWordTwice {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out the first half of the word twice.

Sample Output:

     input: java
     output: jaja
		 */
	Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a word : ");
		String word = input.next();
			
		halfWordTwice(word);
}
	public static void halfWordTwice(String word) {

		int len = word.length();
		System.out.println((word.substring(0, len/2))+(word.substring(0, len/2)) );
	}
}
