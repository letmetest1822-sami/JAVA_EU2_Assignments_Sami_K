package assignments.Lab04;

import java.util.Arrays;

public class Question15_swapFirstLast {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and swap the first and last element in the array.
		 * Print the modified array

			int[] x = {1,2,3,4} 		= > [4,2,3,1]
			int[] y = {1,2,3} 			= > [3,2,1]
			int[] z = {8,6,7,9,5} 		= > [5,6,7,9,8]
		 */

		int[] x = {1,2,3,4};
		int[] y = {1,2,3};
		int[] z = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapFirstLast(x)));
		System.out.println(Arrays.toString(swapFirstLast(y)));
		System.out.println(Arrays.toString(swapFirstLast(z)));
	}

	public static int [] swapFirstLast(int []arr) {
		
		int first = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = first;
		
		return arr;
	}
	
}
