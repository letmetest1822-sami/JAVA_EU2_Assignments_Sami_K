package assignments.Lab04;

public class Question12_firstElement1 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts two arrays
	and prints how many of the arrays have 1 as their first element

		int[] x = {1,2,3}
		Int[] y = {1,3}
							Output = 2
		int[] x = {7,2,3}
		Int[] y = {1}
							Output = 1
		int[] x = {3,2,4}
		Int[] y = {4,3,4}
							Output = 0
							
		 */

		
		int[] x = {1,2,3};
		int[] y = {1,3};
							
		int[] x1 = {7,2,3};
		int[] y1 = {1};
							
		int[] x2 = {3,2,4};
		int[] y2 = {4,3,4};
		
		System.out.println(starts1(x, y));
		System.out.println(starts1(x1, y1));
		System.out.println(starts1(x2, y2));
	}

	public static int starts1 (int [] arr1, int [] arr2) {
		
		int numberOf1=0;
		
			if (arr1[0] == 1) {
				numberOf1++;
			}
			if (arr2[0] == 1) {
				numberOf1++;
			}
		
		return numberOf1;
	}
}
