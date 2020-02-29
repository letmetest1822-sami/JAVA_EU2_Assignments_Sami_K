package assignments.Assignment12;

import java.util.Arrays;

public class Question56_leftShifted {

	public static void main(String[] args) {
		/*
		 * Modify an array that is "left shifted" by one -- 
		 * so    {6, 2, 5, 3}
		 *  becomes {2, 5, 3, 6}. 
		 *  You may modify and print the given array, or print a new array.

Sample Output:
     input: 6, 2, 5, 3
     output: [2, 5, 3, 6]
		 */

		int input [] = {6, 2, 5, 3};
		
		leftShifted(input);
	}
	public static void leftShifted(int arr []) {
		
		int [] shifted = new int [arr.length];
		
		shifted [arr.length-1] = arr[0];
		
			for (int i=0; i<arr.length-1; i++) {
			
				shifted [i] = arr[i+1];
			}
		System.out.println(Arrays.toString(shifted));
	}
}
