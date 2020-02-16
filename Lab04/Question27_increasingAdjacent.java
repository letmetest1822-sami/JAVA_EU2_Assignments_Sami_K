package assignments.Lab04;

public class Question27_increasingAdjacent {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the array contains, somewhere,
three increasing adjacent numbers like 4,5,6,... or 23,24,25.

		int[] x = {1,4,5,6,2}; 		//true
		int[] y = {1,2,3}; 			//true
		int[] z = {1,2,4,5,8,9}; 	//false
		 */

		int[] x = {1,4,5,6,2}; 
		int[] y = {1,2,3}; 	
		int[] z = {1,2,4,5,8,9}; 
		
		System.out.println(increasingAdjacent(x));
		System.out.println(increasingAdjacent(y));
		System.out.println(increasingAdjacent(z));
	}

	public static boolean increasingAdjacent(int [] arr) {
		
		boolean flag = false;
		
		for (int i=0; i<arr.length-2; i++) {
			
			if ((arr[i+1] == (arr[i]+1)) && (arr[i+2] == arr[i+1]+1)) {
				flag = true;
				break;
			}
			else {
				flag = false;
			}
		}
		return flag;
		
	}
}
