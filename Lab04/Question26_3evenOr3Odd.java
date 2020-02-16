package assignments.Lab04;

public class Question26_3evenOr3Odd {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the array contains 3 even
or 3 odd values all next to each other.
			int x[] = {2,1,3,5}; 	//true
			int y[] = {2,1,2,5};	//false
			int z[] = {2,4,2,5}; 	//true
		 */

		int x[] = {2,1,3,5}; 
		int y[] = {2,1,2,5};
		int z[] = {2,4,2,5};
		
		System.out.println(evenOrOdd3_3(x));
		System.out.println(evenOrOdd3_3(y));
		System.out.println(evenOrOdd3_3(z));
	}

	public static boolean evenOrOdd3_3(int [] arr){
		
		int countOdd = 0;
		int countEven = 0;
		
		
		for (int i = 0; i<arr.length; i++) {
			
			if (arr[i]%2 == 0) {
				countEven++;
			} 
			else if (arr[i]%2 != 0) {
				countOdd++;
			}
		}
		if ((countOdd  == 3) || (countEven == 3)){
			return true;
		}
		else {
			return false;
		}
	}
}
