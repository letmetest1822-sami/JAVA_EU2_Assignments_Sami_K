package assignments.Lab04;

public class Question04_SumOfArrayElements {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the sum of all elements in the array
		 
				int[] x = {1,2,3}; 		= >  6
		 		int[] y = {5,11,2}; 	= > 18
		 		int[] z = {7,0,0}; 		= >  7
		 		int[] a = {3,-2,10,4}; 	= > 15
		 */
				int[] x = {1,2,3}; 		
		 		int[] y = {5,11,2}; 	
		 		int[] z = {7,0,0}; 		
		 		int[] a = {3,-2,10,4}; 	
		
		System.out.println("The sum of elements in array is : " + sumArray(x)) ;
		System.out.println("The sum of elements in array is : " + sumArray(y)) ;
		System.out.println("The sum of elements in array is : " + sumArray(z)) ;
		System.out.println("The sum of elements in array is : " + sumArray(a)) ;
	
	}
	public static int sumArray(int[] arr) {
		
		int sum =0;
		
		for (int i=0; i<arr.length; i++) {
			
			sum = sum +arr[i];
		}
		return sum;
	}
}
