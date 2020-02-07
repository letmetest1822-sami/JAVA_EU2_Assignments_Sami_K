package assignments.Lab03;

import java.util.Scanner;

public class Question11_countHi {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "hi" appears anywhere in the given string.
		 * countHi("abchi ho") 	→1
		 * countHi("ABChihi") 	→2
		 * countHi("hihi") 		→2
		 */

		System.out.println(countHi());
		
	}

	public static int countHi() {
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a string including hi : ");
			String word = input.nextLine();
			
		int n = word.length();
		int hi_number=0;
		
		for (int i =0; i<=n-2 ; i++) {
			
			if(word.substring(i, i+2).equalsIgnoreCase("hi")) {
				
				hi_number++;
			}
		}
		
		return hi_number;
	}
}
