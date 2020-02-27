package assignments.Assignment11;import java.util.Arrays;

public class Question50_doubleTheArrayFillZero {

	public static void main(String[] args) {
		/*
		 * Given an int array, print a new array with double the length 
		 * where its last element is the same as the original array, and all the other elements are 0. 
		 * The original array will be length 1 or more. 
		 * Note: by default, a new int array contains all 0's.

Sample Output:
     input: 4 5 6
     output: [0, 0, 0, 0, 0, 6]

     input: 0
     output: [0, 0]

     input: 1 2 3 4
     output: [0, 0, 0, 0, 0, 0, 0, 4]
		 */

		String input = "4 5 6";
		String input2 = "1 2 3 4";
		
		doubleTheArrayFillZero(input);
		doubleTheArrayFillZero(input2);
	}

	public static void doubleTheArrayFillZero(String word) {
		
		String[] arr1 = word.split(" "); 
		
		int len2 = 2 * arr1.length;
		
		String arr2 [] = new String [len2];
		
		for (int i= 0; i< len2-1; i++) {
			
			arr2 [i] = "0";
		}
		arr2[len2-1] = arr1 [arr1.length-1];
		
		System.out.println(Arrays.toString(arr2));
	}
}
