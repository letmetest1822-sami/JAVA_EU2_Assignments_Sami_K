package assignments.Lab04;

public class Question21_all2Sum8 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the sum of all 2's in the
array is exactly 8
		int[] x = {2, 3, 2, 2, 4, 2} = > true
		int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
		int[] x = {1, 2, 3, 4} = > false
		 */

		int[] x = {2, 3, 2, 2, 4, 2};
		int[] x1 = {2, 3, 2, 2, 4, 2, 2};
		int[] x2 = {1, 2, 3, 4};
		
		System.out.println(all2Sum8 (x));
		System.out.println(all2Sum8 (x1));
		System.out.println(all2Sum8 (x2));
		
	}

	public static boolean all2Sum8 (int [] arr) {
		
		int sum = 0;
		boolean flag;
		
		for( int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 2) {
				sum += arr[i];
			}
		}
		if (sum == 8 ) {
			flag = true;
			
		}else {flag =  false;
			}
	return flag;
	}
}
