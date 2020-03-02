package assignments.Assignment13;

import java.util.ArrayList;

public class Question76_twoTimes {

	public static void main(String[] args) {
		/*
		 * Create a method that is called "twoTimes" takes in a single parameter - 
		 * an ArrayList of Integers and returns a new ArrayList of Integers
		 * This method should create a new ArrayList of Integers that contains 
		 * every value of the ArrayList parameter repeated twice.

	For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
		 */

		ArrayList<Integer>inputAL  = new ArrayList<>();
			inputAL.add(1);
			inputAL.add(5);
			inputAL.add(3);
			inputAL.add(7);
		System.out.println(inputAL);
		
		System.out.println(twoTimes(inputAL));
	}
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> AL){
		
		int j = 0;
		
		for (int  i = 0;      i<AL.size();    i++) {
			
			AL.add(j+1, AL.get(i));
			
			j++; j++;
			
			i++;
		}
		return AL;
	}
}
