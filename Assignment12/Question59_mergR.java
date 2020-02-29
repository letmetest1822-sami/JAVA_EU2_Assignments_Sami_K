package assignments.Assignment12;

import java.util.Arrays;

public class Question59_mergR {

	public static void main(String[] args) {
		/*
		 * mergR merges two arrays into one.
it gets two int arrays and returns an int array

Sample Output:

     mergR([1,2,3],[4,5,6])
     returns [1,2,3,4,5,6]

     mergR([1,2],[6,8])
     returns [1,2,6,8]
		 */
		int [] input1 = {1,2,3};
		int [] input2 = {4,5,6};
		
		System.out.println(Arrays.toString(mergR(input1, input2)));
	}
	public static int [] mergR(int [] arr1, int [] arr2) {
		int merged [] = new int [arr1.length + arr2.length];
		int j = 0;
		
			for (int i = 0; i<arr1.length+arr2.length;i++) {
				if (i<arr1.length) {
					merged [i] = arr1[i];
				}
				else {
					merged [i] = arr2[j];
					j++;
				}
			}
		return merged;
	}
}
