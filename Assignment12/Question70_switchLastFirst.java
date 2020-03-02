package assignments.Assignment12;

import java.util.ArrayList;

public class Question70_switchLastFirst {

	public static void main(String[] args) {
		/*
		 * Switch the last element in an array with the first and return the array.

Sample Output:

     do_switch([1,2,3,4])
     returns:[[4,2,3,1]

     do_switch([7,2,3,5])
     returns:[5,2,3,7]
		 */

		ArrayList<Integer> IntegerList1 = new ArrayList<>();
		
		IntegerList1.add(1);
		IntegerList1.add(2);
		IntegerList1.add(3);
		IntegerList1.add(4);
		
		
		System.out.println(IntegerList1);
		switchLastFirst(IntegerList1);
		
	}
	public static void switchLastFirst(ArrayList<Integer> AL) {
		
		int swap = AL.get(0);
		
			AL.set(0, AL.get(AL.size()-1));
			
			AL.set(AL.size()-1, swap);
			
		System.out.println(AL);
	}
}
