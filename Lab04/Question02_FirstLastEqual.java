package assignments.Lab04;

public class Question02_FirstLastEqual {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and check the length of the array first.
		 * If the length is more than one, check if the first element and last element are equal. 
		 * if it is print true, if not print false.
		 * If the length is not more than 1, print not valid an array
		 
		 * int[] x = {1,2,3}; = > false
		 * int[] y = {1,2,3,1}; = > true
		 * int[] z = {1,2,1}; = > true
		 * int[] k = {1}; = > not a valid array
		 */
		
		int [] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		System.out.println(FirstLastEqual(x));
		System.out.println(FirstLastEqual(y));
		System.out.println(FirstLastEqual(z));
		System.out.println(FirstLastEqual(k));
		
	}
	public static String FirstLastEqual(int [] numbers) {
		
		if (numbers.length<=1) {
			return "not a valid array";
		}
		else {
		if (numbers[0] == numbers[numbers.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}
		
}
}
