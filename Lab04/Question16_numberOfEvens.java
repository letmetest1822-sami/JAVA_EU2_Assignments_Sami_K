package assignments.Lab04;

public class Question16_numberOfEvens {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the number of even numbers in the array.

			int[] x = {2,1,2,3,4} 	= > 3
			int[] y = {2,2,0} 		= > 3
			int[] z = {1,3,5} 		= > 0
		 */

		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5};
		
		System.out.println(numberOfEvens(x));
		System.out.println(numberOfEvens(y));
		System.out.println(numberOfEvens(z));
	}

	public static int numberOfEvens(int [] arr) {
		
		int numEvens=0;
		
		for (int value : arr) {
			
			if (value % 2 == 0) {
				numEvens++;
			}
		}
		return numEvens;
	}
}
