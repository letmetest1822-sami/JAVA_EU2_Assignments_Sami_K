package assignments.Assignment13;

import java.util.Arrays;

public class Question79_scalarMultiplication {

	public static void main(String[] args) {
		/*
		 * Scalar multiplication of matrix is the simplest and easiest way to multiply matrix .
		 * Basically you get an int 2d array and need to multiply each of its elements by the value of parameter n int.
		 * And return the same 2D array back.

Sample Output:

matrix =
[
[1,1,1]
[1,1,2]
]

scalar(matrix,5)

returns(after multiplying each value by 5):

[
[5,5,5]
[5,5,10]
]

--------------------

matrix =
[
[2,3,5]
[1,1,2]
]

scalar(matrix,2)

returns:

[
[4,6,10]
[2,2,4]
]


hint: use two nested for loops
		 */

		int [] [] inputMatrix1 = {{1,1,1},{1,1,2}};
		int [] [] inputMatrix2 = {{2,3,5},{1,1,2}};
		
		int inputMultiplier1 = 5;
		int inputMultiplier2 = 2;
		
		System.out.println(Arrays.deepToString(inputMatrix1));
		System.out.println(Arrays.deepToString(scalar(inputMatrix1,inputMultiplier1)));
		
		System.out.println("*********");
		
		System.out.println(Arrays.deepToString(inputMatrix2));
		System.out.println(Arrays.deepToString(scalar(inputMatrix2,inputMultiplier2)));
	}
	public static int [][] scalar (int [] [] matrix, int multiplier){
		
		for (int i = 0; i<matrix.length;i++) {
			
			for(int j=0;   j<matrix[i].length;   j++) {
				
				matrix[i][j] = matrix[i][j] * multiplier;
			}
		}
		return matrix;
	}
}
