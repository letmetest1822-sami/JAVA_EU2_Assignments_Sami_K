package assignments.Assignment12;

import java.util.ArrayList;

public class Question67_timesTwo {

	public static void main(String[] args) {
		/*
		 * Create a method that is called timesTwo takes in a single parameter - 
		 * an ArrayList of Integers called nums returns nothing

This method should take the ArrayList parameter and multiply every value by two.
		 */

		ArrayList<Integer> IntegerList = new ArrayList<>();
		
		IntegerList.add(10);
		IntegerList.add(7);
		IntegerList.add(4);
		IntegerList.add(3);
		
		System.out.println(IntegerList.toString());
		timesTwo(IntegerList);
	}
	public static void timesTwo(ArrayList<Integer> nums) {
		
		for (int i=0; i< nums.size();i++) {
			
			nums.set (i, nums.get (i) * 2);
		}
	System.out.println(nums);	
	}
}
