package assignments.Lab04;

public class Question08_contains2_3 {

	public static void main(String[] args) {
		/* 
		 * Write a method that accepts an array and prints true if it contains a 2 or a 3
			int[] x = {2,5};	= > true
			int[] y = {4,3}; 	= > true
			int[] z = {4,5}; 	= > false
		 */
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5}; 
		
		System.out.println(contains2_3(x));
		System.out.println(contains2_3(y));
		System.out.println(contains2_3(z));
	}
	public static boolean contains2_3(int [] arr) {
		
		
		for(int i=0; i<arr.length; i++) {
			
			if((arr[i] == 2) || (arr[i] == 3)) {
				
			return true;
		}
			
		}
		return false;
		
}
}
