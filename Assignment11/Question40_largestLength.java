package assignments.Assignment11;

import java.util.Arrays;

public class Question40_largestLength {

	public static void main(String[] args) {
		/*
		 * Given the array words, it will print the word with the largest length. 
		 * Assume that there are no 2 words with longest length

Sample output:
     words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
     prints jaaaaavvaaaaaaaaaa
		 */
		String [] input = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
		largestLength(input);
	}
	public static void largestLength(String [] arr) {
		
		String largest = arr[0];
		
		for (int i = 1; i< arr.length; i++) {
			
			if(arr[i].length() > largest.length()) {
				
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
