package assignments.Lab04;

import java.util.Arrays;

public class Question17_differenceOfLargestSmallest {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and print the difference between the largest and
smallest values in the array.


			int[] x = {10,3,5,6} 	= > 7
			int[] y = {7,2,10,9}	= > 8
			int[] z = {2,10,7,2} 	= > 8
			
		 */

		int[] x = {10,3,5,6};
		int[] y = {7,2,10,9};
		int[] z = {2,10,7,2};
		
		System.out.println(differenceOfLargestSmallest(x));
		System.out.println(differenceOfLargestSmallest(y));
		System.out.println(differenceOfLargestSmallest(z));
	}

	public static int differenceOfLargestSmallest(int []arr) {
		
		int difference=0;
		
		Arrays.sort(arr);
		
		return difference = (arr[arr.length-1]) - arr[0];
	}
}
