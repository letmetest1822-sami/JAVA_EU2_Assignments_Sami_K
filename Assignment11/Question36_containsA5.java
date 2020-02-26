package assignments.Assignment11;

public class Question36_containsA5 {

	public static void main(String[] args) {
		/*
		 * Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
		 * If no consecutive 5s or no 5s are detected in your code then print false.

Sample output:

     nums → [1, 5, 5, 1, 1] → true
     nums → [1, 8, 5, 5, 0] → true
     nums → [1, 5, 4, 1, 5] → false
     nums → [1, 4, 4, 1, 99] → false
		 */

		int nums1 [] = {1, 5, 5, 1, 1};
		int nums2 [] = {1, 8, 5, 5, 0};
		int nums3 [] = {1, 5, 4, 1, 5};
		int nums4 [] = {1, 4, 4, 1, 99};
		
		containsA5(nums1);
		containsA5(nums2);
		containsA5(nums3);
		containsA5(nums4);
	}
	public static void containsA5(int [] arr) {
		
		boolean flag = false;
		
		for (int i = 0;   i<arr.length-1;i++) {
			
			if( (arr[i]==5) && (arr[i+1]==5) ) {
				
				flag = true;
			}
		}
	System.out.println(flag);
	}
}
