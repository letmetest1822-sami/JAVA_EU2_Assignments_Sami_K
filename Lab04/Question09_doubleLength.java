package assignments.Lab04;

import java.util.Arrays;

public class Question09_doubleLength {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints a new array with double the length
	where its last element is the same as the original array,
			
			int[] x = {4,5,6}; = > [0,0,0,0,0,6]
		 */

		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(doubleLength(x)));
	}

	public static int [] doubleLength(int [] arr) {
		
		int [] doubleArr  = new  int[2*arr.length];
		
		doubleArr [doubleArr.length-1]= arr[arr.length-1];
		
		return doubleArr;
	}
}
