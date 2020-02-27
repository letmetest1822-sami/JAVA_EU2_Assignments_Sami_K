package assignments.Assignment11;

import java.util.Arrays;

public class Question49_first2ElementsArray {

	public static void main(String[] args) {
		/*
		 * Given an int array of any length, print a new array of its first 2 elements. 
		 * If the array is smaller than length 2, use whatever elements are present.

Sample Output:
     input 1, 2, 3
     output: [1, 2]

     input 1,
     output: [1]
		 */
		int input [] = {1, 2, 3};
		int input2 [] = {1};
		first2ElementsArray(input);
		first2ElementsArray(input2);	
	}
	public static void first2ElementsArray(int []arr) {
		
		if(arr.length<2) {
			System.out.println(Arrays.toString(arr));
		}else 
			{
			System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));
		}
	}
}
