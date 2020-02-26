package assignments.Assignment11;

import java.util.Arrays;

public class Question43_reverseArray {

	public static void main(String[] args) {
		/*
		 * Given an array nums with 7 integers already assigned, write code to reverse it. 
		 * Do not use any additional arrays or Strings.

Sample Output:

nums -> [4, 3, 2, 44, 1, 100, 55]
change it to:
nums -> [55, 100, 1, 44, 2, 3, 4]
		 */

		int [] input = {4, 3, 2, 44, 1, 100, 55};
		
		reverseArray(input);
	}
	public static void reverseArray(int []arr) {
		int i = 0;
		int j = arr.length-1;
		int x   = 0;
		do {
			x       = arr[i]; 
			arr [i]	= arr[j]; 
			arr [j]	= x;  
			i++;j--;
		
			x       = arr[i];
			arr[i]  = arr[j];
			arr[j]  = x; 
			i++;j--;
		
			x       = arr[i];
			arr[i]  = x; 
			}
			while (j>i);
		
		System.out.println(Arrays.toString(arr));
	}
}
