package assignments.Assignment11;

import java.util.Arrays;

public class Question32_first3Letters {

	public static void main(String[] args) {
		/*
		 * The code provided in your main method will take in five Strings and 
		 save them into an array called arr. 
		 * Print out the first three letters of each element of arr, one per line. 
		 * You can assume that every element of arr is at least 3 letters long.

			Sample Output:
     			arr -> ["apple", "banana"]
     				prints: app
     						ban
		 */

		first3Letters("apple", "banana", "kiwi", "mango", "orange");
	}
	public static void first3Letters(String w1, String w2, String w3, String w4, String w5) {
	
		String []words = new String[5];
	
		words [0] = w1;
		words [1] = w2;
		words [2] = w3;
		words [3] = w4;
		words [4] = w5;
		
		for (int i =0; i<words.length;i++) {
			
			System.out.println(words [i].substring(0, 3));
		}
	}
}
