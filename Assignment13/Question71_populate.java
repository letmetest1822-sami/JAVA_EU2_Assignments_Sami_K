package assignments.Assignment13;

import java.util.Arrays;

public class Question71_populate {

	public static void main(String[] args) {
		/*
		 * Create a method called populate that accepts an empty int array and populates it with numbers counting up.

Sample Output:

     populate(new int[3])
     returns:[1,2,3]

     populate(new int[5])
     returns:[1,2,3,4,5]
		 */

		int [] input = new int [5];
		
		populate (input);
		
	}
	public static void populate (int []arr) {
		for (int i = 0; i< arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
