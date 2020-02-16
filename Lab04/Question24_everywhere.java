package assignments.Lab04;

public class Question24_everywhere {

	public static void main(String[] args) {
		/*
		 * A value is "everywhere" in an array if for every pair of adjacent elements in the array, 
		at least one of the pair is that value.
		 * Write a method that accepts an array and a number, 
		 * and prints true if the given number is everywhere in the array.

			int[] x = {1, 2, 1, 3};
	 		int a = 2;
									Output: false
			int[] x = {1, 2, 1, 3};
			int a = 1;
									Output: true
		 */

		int[] x = {1, 2, 1, 3};
 		int a = 2;
					
		int[] x1 = {1, 2, 1, 3};
		int a1 = 1;
		
		System.out.println(everywhere(x,a));
		System.out.println(everywhere(x1,a1));
	}

	public static boolean everywhere(int[] arr, int a) {
	
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]==a && (arr[i+1]==a || arr[i+2]==a)) {
				
				return true;
			}
		}
		
		return false;
	
	}	
		
}
