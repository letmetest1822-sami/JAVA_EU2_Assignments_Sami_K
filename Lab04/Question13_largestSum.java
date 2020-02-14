package assignments.Lab04;

import java.util.Arrays;

public class Question13_largestSum {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and consider the sum of the values in each array.
		 * Print the array which has the largest sum. In event of a tie, print "equal"

			int[] x = {1,2}  	int[] y = {3,4} 	= > [3,4]
			int[] x = {5,6}  	int[] y = {3,8}		= > equal
			int[] x = {1,1}  	int[] y = {1,0}		= > [1,1]
			
		 */

		int[] x = {1,2};  	int[] y = {3,4};
		int[] x1 = {5,6};  	int[] y1 = {3,8};
		int[] x2 = {1,1};  	int[] y2 = {1,0};
		
		System.out.println(largestSum(x, y));
		System.out.println(largestSum(x1, y1));
		System.out.println(largestSum(x2, y2));
	}

	public static String largestSum(int [] arr1, int [] arr2) {
		
		int sum1=0;
		
		int sum2=0;
		
		String result = "";
		
		for( int value: arr1) {
			sum1+=value;
		}
		
		for( int value: arr2) {
			sum2+=value;
		}
		
		if (sum1>sum2) {
			result = Arrays.toString(arr1);
		}
		else if (sum2>sum1) {
			result =  Arrays.toString(arr2);
		}
		else if (sum1==sum2) {
			result = "equal";
		}
		return result;
	}
}

