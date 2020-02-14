package assignments.Lab04;

import java.util.Arrays;

public class Question11_3follows2 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array, and if there is a 2 in the array immediately
followed by a 3, set the 3 element to 0. Print the changed Array

		int[] x = {1,2,3} 			= > [1,2,0]
		int[] x = {2,3,5} 			= > [2,0,5]
		int[] x = {1,2,1} 			= > [1,2,1]
		int[] x = {11,2,13,3,2} 	= > [11,2,13,3,2]
		 */

		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] w = {11,2,13,3,2};
		
		System.out.println(follows3_2(x)); 
		System.out.println(follows3_2(y)); 
		System.out.println(follows3_2(z)); 
		System.out.println(follows3_2(w)); 
				
	}

	public static String follows3_2 (int [] arr) {
		for (int i=0;    i<arr.length-1;   i++) {
			
			if ((arr[i]==2) && (arr[i+1]==3)){
				arr[i+1]=0;
			}
		}
		return Arrays.toString(arr);
	}
} 
