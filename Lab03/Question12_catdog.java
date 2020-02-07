package assignments.Lab03;

import java.util.Scanner;

public class Question12_catdog {

	public static void main(String[] args) {
		/*
		 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
		 * catDog("catdog") 		→true
		 * catDog("catcat") 		→false
		 * catDog("1cat1cadodog") 	→true
		 */

		catDog();
	}

	public static void catDog() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a word to check if there is cat anddog at the same time : ");
			String word = input.nextLine();

			int n = word.length()-3;
			int dog = 0;
			int cat = 0;
			
			for (int i=0;     i<=n ;    i++ ) {
				
				if (word.substring(i, i+3).equalsIgnoreCase("dog"))   {
					dog++;
					
				}else if  (word.substring(i, i+3).equalsIgnoreCase("cat") ) {
					cat++;
				}
			}
			if (cat == dog) {
				
				System.out.println(true);
				
			}else {System.out.println(false);
		
	}
}
}
