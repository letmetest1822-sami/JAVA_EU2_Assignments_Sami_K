package assignments.Lab03;

import java.util.Scanner;

public class Question14_endsLy {

	public static void main(String[] args) {
		/*
		 * Given a string, return true if it ends in "ly".
		 
		 * endsLy("oddly") 	→true
		 * endsLy("y") 		→false
		 * endsLy("oddy") 	→false
		 */

		System.out.println(endsLy());
	}

	public static boolean endsLy() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a word to check if it is ending with ...ly : ");
			String word = input.nextLine();
			
		int n = word.length();
		
			if (word.substring(n-2).equals("ly")) {
			
			return	true;
			
			}else {
			
			return	false;
		}
	}
}
