package assignments.Lab04;

import java.util.Arrays;

public class Question05_rotatedLeft {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints an array with the elements"rotated left”
		 		int[] x = {1,2,3};  		= > [2,3,1]
		 		int[] y = {17,12,10,8}; 	= > [12,10,8,17]
		 		int[] a = {7,0,0}; 			= > [0,0,7]
		 */

		
		int[] x = {1,2,3};  	
		int[] y = {17,12,10,8}; 
		int[] a = {7,0,0}; 	
		
		
			System.out.println(Arrays.toString(rotateLeft (x)));
			System.out.println(Arrays.toString(rotateLeft (y)));
			System.out.println(Arrays.toString(rotateLeft (a)));
		
	}
	public static int [] rotateLeft (int []arr){
		
		int x = arr[0];
		
		for (int i = 0 ;   i<arr.length-1; i++) {
			arr[i]= arr[i+1];
		}
		
		arr[arr.length-1]=x;
		return arr;
	}

}
