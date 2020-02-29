package assignments.Assignment12;

import java.util.Arrays;

public class Question58_findBiggestElement {

	public static void main(String[] args) {
		/*
		 * Given a 2d array of ints, find the biggest number(integer) 
		 * and replace all array values on the biggest number in the array then print an array.

		Sample Output:
     Given values: [[1, 2, 3], [5, 33, 9]]
     	output   : [[33, 33, 33], [33, 33, 33]]
		 */

		int input [][] = {{1,2,3},{5,33,9}};
		findBiggestElement(input);
	}
	public static void findBiggestElement(int arr [][]) {
		
		
System.out.println("At  the beginning     : " + Arrays.deepToString(arr));
		
		int max = arr[0][0];
		
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[0].length ; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
				System.out.println("****************************************************");
		
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[0].length ; j++) {
				arr[i][j] = max;
			}
		}
		
		System.out.println("Replaced with biggest : " +Arrays.deepToString(arr));
		
	}
}
