package assignments.Assignment11;

import java.util.Arrays;

public class Question37_firstLastLetterArray {

	public static void main(String[] args) {
		/*
		 * Given a String array words, iterate through each word and 
		 * print first and last letter of each element in the format below.

Sample Output:

     words → ["hello", "why", "by", "apple" , "note"]
     print → [ho, wy, by, ae, ne]
		 */

		String input [] = {"hello", "why", "by", "apple", "note"};
		
		System.out.println(Arrays.toString(firstLastLetterArray(input))); 
		
	}
	public static String [] firstLastLetterArray(String [] arr) {
		
		String lettersArr [] = new String [arr.length];
		
		for (int i = 0; i<arr.length ; i++) {
			
			lettersArr [i] = arr[i].substring(0,1) + (arr[i].substring(arr[i].length()-1));
		}
		return lettersArr;
	}
}
