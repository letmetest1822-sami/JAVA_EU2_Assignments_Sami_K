package assignments.Lab04;

public class Question19_7follows6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the total of the numbers in the array, 
		 * except ignore sections of numbers starting with a 6 and extending to the next 7
		 * (every 6 will be followed by at least one 7).

			int[] x = {1,2,2} 					= > 5
			int[] y = {1, 2, 2, 6, 99, 99, 7} 	= > 5
			int[] a = {1,1,6,7,2} 				= > 4
			int[] b = {1,1,6,2,7}				= > 2
			int[] c = {1,2,2,6,99,99,7,3,4}		= > 12
			
		 */

		int[] x = {1,2,2};
		int[] y = {1, 2, 2, 6, 99, 99, 7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2,7};
		int[] c = {1,2,2,6,99,99,7,3,4};
		
		System.out.println(follows6_7(x));
		System.out.println(follows6_7(y));
		System.out.println(follows6_7(a));
		System.out.println(follows6_7(b));
		System.out.println(follows6_7(c));
	}

	public static int follows6_7(int [] arr) {
		
		int  sum =0;
		
		for (int i=0;   i<arr.length;  i++) {
			
			if(arr[i] !=6) {
				
			sum+=arr[i];
			
			}else {
				
				do {
					i++;
					
					}while (arr[i]!=7);
				}
		}
		return sum;
	}
}
