package assignments.Assignment11;

import java.util.Arrays;

public class Question38_countOfEvenNumbers {

	public static void main(String[] args) {
		/*
		 * Given an array nums, calculate the count of even numbers in nums and print out to console.

		Sample Output:

     nums → [2, 1, 2, 3, 4]) → 3
     nums → [2, 2, 0, 3, 5]) → 3
     nums → [1, 3, 5, 7, 9]) → 0
		 */

		int input1 [] = {2, 1, 2, 3, 4};
		int input2 [] = {2, 2, 0, 3, 5};
		int input3 [] = {1, 3, 5, 7, 9};
		
		System.out.println(countOfEvenNumbers(input1)); 
		System.out.println(countOfEvenNumbers(input2));
		System.out.println(countOfEvenNumbers(input3));
	}
	public static int countOfEvenNumbers(int []arr) {
		
		int countEven=0;
		
		for (int i = 0; i<arr.length; i++) {
			
			if (arr[i]%2==0) {
				
				countEven++;
			}
		}
		return countEven;
	}
}
