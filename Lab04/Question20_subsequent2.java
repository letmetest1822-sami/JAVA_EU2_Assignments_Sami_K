package assignments.Lab04;

public class Question20_subsequent2 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true 
	if the array contains a 2 next to a 2 somewhere.
	
			int[] x = {1,2,2} 		= > true
			int[] y = {1, 2, 1,2} 	= > false
			int[] a = {2,1,2} 		= > false
			int[] b = {2,2,1,2} 	= > true
		 */

		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
			
		System.out.println(subsequent2(x));
		System.out.println(subsequent2(y));
		System.out.println(subsequent2(a));
		System.out.println(subsequent2(b));
	}

	public static boolean subsequent2(int []arr) {
		
		boolean flag = false;
		
		for( int i =0; i<arr.length-1;   i++) {
			
			if ((arr[i] == arr[i+1]) && (arr[i] == 2)) {
				
				flag= true;
				
				break;
				
			}else {flag=false;
			
			}
		}
		return flag;
		
	}
}
