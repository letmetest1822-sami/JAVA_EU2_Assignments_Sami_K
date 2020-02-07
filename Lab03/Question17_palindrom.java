package assignments.Lab03;

import java.util.Scanner;

public class Question17_palindrom {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts a string and returns true if the string is palindrome.
		 */

		System.out.println(isPalindrom());
	}

	public static boolean isPalindrom() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a single word to check it whether it is palindrom or not : ");
			String word = input.nextLine();
			
		int n = word.length();
		String mirror = "";
		
		for (int i=n-1;  i>=0; i--) {
			mirror = mirror + (word.charAt(i));
			
		}
			if (word.replace(" ", "").equalsIgnoreCase(mirror.replace(" ", ""))){
				return true;
			}else {
				return false;
			}
	}
}
