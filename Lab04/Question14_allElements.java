package assignments.Lab04;

import java.util.Arrays;

public class Question14_allElements {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and prints a new array containing all their elements

		int[] x = {1,2} 	int[] y = {3,4} 	= > [1,2,3,4]
		int[] x = {4,4} 	int[] y = {2,2} 	= > [4,4,2,2]
		int[] x = {9,2,3} 	int[] y = {3,4,5} 	= > [9,2,3,3,4,5]
		 */
		int[] x  = {1,2}; 		int[] y  = {3,4};
		int[] x1 = {4,4}; 		int[] y1 = {2,2};
		int[] x2 = {9,2,3}; 	int[] y2 = {3,4,5};

		System.out.println(Arrays.toString(combine (x, y)));
		System.out.println(Arrays.toString(combine (x1, y1)));
		System.out.println(Arrays.toString(combine (x2, y2)));
	}

	public static int [] combine (int [] arr1, int [] arr2) {
		
		int newLength = (arr1.length+arr1.length);
		
		int [] newArr = new int [newLength];
		
		for (int i=0; i<arr1.length;i++) {
			newArr[i] = arr1[i];
		}
		int j=0;
		
		for (int i = arr1.length; i<newLength;i++) {
			newArr[i] = arr2[j];
			j++;
		}
		
		return newArr;
	}
}
