package assignments.Lab04;

import java.util.Arrays;

public class Question07_firstAndSecondElement {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and prints the second array containing 
		 the first and last elements from the first array.
			int[] x = {1,2,3};
			int[] y = {}; 			= > [1,3]
			int[] a = {7,4,6,2};
			int[] b = {}; 			= > [7,2]
		 */

		int[] x = {1,2,3};
		int[] y = {}; 
		int[] a = {7,4,6,2};
		int[] b = {};
				
		System.out.println(Arrays.toString(firstAndSecond(x,y)));
		System.out.println(Arrays.toString(firstAndSecond(a,b)));
	}

	public static int[] firstAndSecond (int[] firstArr, int []secondArr) {
		
		int [] newArr = new int [2];
		
			newArr[0] = firstArr[0] ;
			
			newArr[1] = firstArr[firstArr.length-1];
			
		return newArr;
	}
} 
