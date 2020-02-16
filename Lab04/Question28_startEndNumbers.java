package assignments.Lab04;

import java.util.Arrays;

public class Question28_startEndNumbers {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts start and end numbers. 
		 * Given start and end numbers, return a new array 
		 * new array containing the sequence of integers from start up to but not including end, 
		 * so 

		start=5 and end=10 yields 	  [5, 6, 7, 8, 9].
		fizzArray3(5, 10) 		    → [5, 6, 7, 8, 9]
		fizzArray3(11, 18)   		→ [11, 12, 13, 14, 15, 16, 17]
		fizzArray3(1, 3) 			→ [1, 2]
		 */

		int start1 = 5, end1 = 10;
		int start2 = 11, end2 = 18;
		int start3 = 1, end3 = 3;
		
		System.out.println(Arrays.toString(startEndNumbers(start1,end1)));
	}

	public static int [] startEndNumbers(int a, int b) {
		
		int Len = b-a;
		
		int [] arr = new int [Len];
		
		for (int i = a; i < b; i++ ) {
			arr [i] = i;
		}
		return arr;
	}
}
