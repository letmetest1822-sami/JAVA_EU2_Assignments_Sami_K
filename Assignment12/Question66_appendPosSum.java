package assignments.Assignment12;

import java.util.ArrayList;

public class Question66_appendPosSum {

	public static void main(String[] args) {
		/*
		 * Create a method that is called appendPosSum takes one parameter: 
		 * an ArrayList of Integers and returns an ArrayList of Integers
		 * This method should:
		 * Create a new ArrayList of Integers
		 * Add only the positive Integers to the new ArrayList
		 * Sum the positive Integers in the new ArrayList and add the Sum as the last element
		 * For example, 
		 	if the incoming ArrayList contains the Integers (4,-6, 3,-8,0,4, 3), 
		 		 the ArrayList that gets returned should be (4,    3,     4, 3,  14), 
		 * with 14 being the sum of (4, 3, 4, 3). 
		 * The original ArrayList should remain unchanged.
		 */

		ArrayList<Integer> IntegerList = new ArrayList<>();
		
		IntegerList.add(10);
		IntegerList.add(-11);
		IntegerList.add(7);
		IntegerList.add(-3);
		IntegerList.add(4);
		IntegerList.add(-13);
		IntegerList.add(-17);
		IntegerList.add(3);
		
		System.out.println(IntegerList.toString());
		System.out.println(appendPosSum(IntegerList).toString());
		
	}
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> inputAL){
		
		ArrayList<Integer> sumOfPositiveElements = new ArrayList<>();
		
		int sum = 0;
		
		for (int i = 0; i< inputAL.size(); i++) {
			if (inputAL.get(i) > 0) {
				
				sumOfPositiveElements.add(inputAL.get(i));
				
				sum += inputAL.get(i);
			}
		}
		sumOfPositiveElements.add(sum);
		
		return sumOfPositiveElements;
	}
}

