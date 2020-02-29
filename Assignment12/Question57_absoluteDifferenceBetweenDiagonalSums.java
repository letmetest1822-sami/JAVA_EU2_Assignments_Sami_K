package assignments.Assignment12;

import java.util.Arrays;

public class Question57_absoluteDifferenceBetweenDiagonalSums {

	public static void main(String[] args) {
		/*
		 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix is shown below:
1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9 = 15. 
The right to left diagonal = 3+5+9 = 17. 
Their absolute difference is |15-17| = 2.
		 */
		int square [][] = {{1,2,3},{4,5,6},{9,8,9}};
		
		 System.out.println(absoluteDifferenceBetweenDiagonalSums(square)); 
		 System.out.println(Arrays.deepToString(square));
	}
	public static int absoluteDifferenceBetweenDiagonalSums(int arr[] []) {
		
		int leftDiagonal  = 0;
		
		int rightDiagonal = 0;
		
		for (int  i = 0; i < arr.length; i++ ) {
			
			leftDiagonal += arr[i] [i];
			
			rightDiagonal += arr[i] [arr.length-1-i];
		}
		return Math.abs(rightDiagonal-leftDiagonal);
		
	}
}
