package assignments.Lab04;

public class Question10_twice2or3 {

	public static void main(String[] args) {
		/*Write a method that accepts an array and prints true if the array contains 2 twice or 3 twice.
			int[] x = {2,2}; 		= > true
			int[] y = {3,3}; 		= > true
			int[] a = {2,3}; 		= > false
			int[] b = {12,20,42};	= > false
			int[] c = {2,2,2}; 		= > false
		 */
		
		int[] x = {2,2};
		int[] y = {3,3};
		int[] a = {2,3};
		int[] b = {12,20,42};
		int[] c = {2,2,2}; 
		
		System.out.println(twice2_3(x));
		System.out.println(twice2_3(y));
		System.out.println(twice2_3(a));
		System.out.println(twice2_3(b));
		System.out.println(twice2_3(c));
	}

	public static boolean twice2_3(int[] arr) {
		
		int num2 =0;
		int num3 =0;
		
		for(int value : arr) {
			if (value == 2) {
				num2++;
			}else if (value == 3) {
				num3++;
			}
		}
		if ((num2==2)||(num3 == 2)) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
}
