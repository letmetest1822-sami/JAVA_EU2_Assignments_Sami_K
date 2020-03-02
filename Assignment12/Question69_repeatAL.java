package assignments.Assignment12;

import java.util.ArrayList;

public class Question69_repeatAL {

	public static void main(String[] args) {
		/*
		 * Create a method that: is called repeatAL takes in a single parameter - an ArrayList of Booleans 
		 * and returns nothing
		 * This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
		 */
		ArrayList<Boolean> BooleanList = new ArrayList<Boolean>();
		
		BooleanList.add(true);
		BooleanList.add(false);
		BooleanList.add(false);
		
		System.out.println(BooleanList);
		repeatAL(BooleanList);
	}
	public static void repeatAL(ArrayList<Boolean>AL) {
		for( int i =0; i<AL.size();i++) {
			AL.add(AL.get(i));
		}
		System.out.println(AL);
	}
}
