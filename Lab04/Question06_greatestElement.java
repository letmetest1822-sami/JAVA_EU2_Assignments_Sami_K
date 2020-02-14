package assignments.Lab04;

import java.util.Arrays;

public class Question06_greatestElement {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and figure out which is greatest element 
		 * in the array, a and set all the other elements to be that value.
		 * Print the changed array.
		 	int[] x = {1,2,3};    				= > [3,3,3]
		 	int[] y = {11,5,9};   				= > [11,11,11]
		 	int[] a = {110,5,98,0,1200,11,-4}; 	= > [1200,1200,1200,1200,1200,1200,1200]
		 */

		int[] x = {1,2,3};
		int[] y = {11,5,9};
		int[] a = {110,5,98,0,1200,11,-4};
		
		System.out.println(copyGreatestElement(x));  //call the method with x parameter and print it
		System.out.println(copyGreatestElement(y));  //call the method with y parameter and print it
		System.out.println(copyGreatestElement(a));	 //call the method with a parameter and print it
	}

	public static String copyGreatestElement(int[] arr) { // create a method with array input
		
		Arrays.sort(arr); // sort the array from smallest to greatest, import util.Arrays
			
		int maxArr = arr[arr. length-1]; // create a max variable and assign the last member of the array= the greatest
		
		for (int i=0;      i<(arr.length);     i++) {  // assign the max value of previous array as the each member of the new array
			arr[i]= maxArr;
		}
		return Arrays.toString(arr); // return the new array as output of the method
	}
}
