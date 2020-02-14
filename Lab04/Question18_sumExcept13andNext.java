package assignments.Lab04;

public class Question18_sumExcept13andNext {

	public static void main(String[] args) {
		/*
		 * Write a function that accepts an array and prints the sum of the numbers in the array. 
		 * Except the number 13 is very unlucky,
		 * so it does not count and numbers that come immediately after a 13 also do not count

			int[] x = {1,2,2,1} 		= > 6
			int[] y = {1,1} 			= > 2
			int[] a = {1,2,2,1,13} 		= > 6
			int[] b = {1,2,2,1,13,3} 	= > 6
		 */
		int[] x = {1,2,2,1};
		int[] y = {1,1};
		int[] a = {1,2,2,1,13};
		int[] b = {1,2,2,1,13,3};
		
		System.out.println(sumExcept13andNext(x));
		System.out.println(sumExcept13andNext(y));
		System.out.println(sumExcept13andNext(a));
		System.out.println(sumExcept13andNext(b));
		

	}

	public static int sumExcept13andNext(int [] arr) {
		
		int sum = 0;
		
		for(int i =0; i<arr.length; i++) {
			
			if (arr[i] !=13) {
				
				sum+=arr[i];
				
			}else {i++;
			}
		}
		return sum;
	}
}
