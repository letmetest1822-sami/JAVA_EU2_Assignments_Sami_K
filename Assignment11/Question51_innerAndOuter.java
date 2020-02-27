package assignments.Assignment11;

import java.util.Arrays;

public class Question51_innerAndOuter {

	public static void main(String[] args) {
		/*
		 * Given two arrays of ints sorted in increasing order, outer and inner, 
		 * print out true if all of the numbers in inner appear in outer. 
		 * Take advantage of the fact that both arrays are already in sorted order.

Sample Output:
     input (outer): 1, 2, 4, 6
     input (inner): 2, 4
     output: true

     input (outer): 1, 2, 4
     input (inner): 6, 5
     output: false
		 */
		int outer [] = {1, 2, 4, 6};
		int inner [] = {2, 4};
		
		int outer2 [] = {1, 2, 4};
		int inner2 [] = {6, 5};
		
		innerAndOuter(outer, inner);
		innerAndOuter(outer2, inner2);
	}
	public static void innerAndOuter(int [] arr1 ,int [] arr2  ) {
		
		for(int i=0; i<arr1.length;i++) {
			
			if(arr2.length<arr1.length) {
				
				if((Arrays.binarySearch(arr1, arr2[i]))>0){
					System.out.println(true);
					break;
				}else 
					{System.out.println(false);
					break;
				}
			}
		}
	}
	
}
