package assignments.Lab04;

import java.util.Scanner;

public class Question01_is6in {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and return true if 6 appears as 
		 * either the first or last element in the array. 
		 * The array will be length 1 or more.
		 
		 * int[] x = {1,2,6};  		= > true
		 * int[] y = {6,1,2,3}; 	= > true
		 * int[] z = {13,6,1,2,3}; 	= > false
		 */

		int [] array1 =  {6, 35,2};
		int []     x  =  {1, 2, 6}; 
		int []     y  =  {6, 1, 2, 3}; 
		int []     z  =  {13,6, 1, 2, 3}; 
		
		System.out.println(is6in(array1));
		System.out.println(is6in(x));
		System.out.println(is6in(y));
		System.out.println(is6in(z));
		
	}

	public static boolean is6in(int[] array) {
		
		boolean flag=false;
			
		if (array.length>=1 && (array[0] == 6 || array[array.length-1] == 6)) {
			
			flag = true;
		}
		return flag;
	}
}
