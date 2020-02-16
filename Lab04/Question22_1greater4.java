package assignments.Lab04;

public class Question22_1greater4 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the number 1's is greater
than the number 4's
		int[] x = {1,4,1} 		= > true
		int[] x = {1,4,1,4}		= > false
		int[] x = {1,1} 		= > true
		 */

		int[] x = {1,4,1};
		int[] x1 = {1,4,1,4};
		int[] x2 = {1,1};
		
		System.out.println(greater1_4(x));
		System.out.println(greater1_4(x1));
		System.out.println(greater1_4(x2));
		
	}
	public static boolean greater1_4(int[] arr) {
		
		int count1 = 0;
		int count4 = 0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count1++;
			}else if(arr[i] == 4) {
				count4++;
			}
		}
		if (count1>count4) {
			return true;
		}else {
			return false;
		}
}
}
