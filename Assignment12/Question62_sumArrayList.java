package assignments.Assignment12;

import java.util.ArrayList;

public class Question62_sumArrayList {

	public static void main(String[] args) {
		/*
		 * Write a method that will take an argument of ArrayList of Integers called ints, 
		 * find and return the sum of all the Integers in ints.
		 */
		
		ArrayList<Integer> sampleList = new ArrayList<>();
		
		sampleList.add(4);
		sampleList.add(7);
		sampleList.add(9);
		
		System.out.println(sampleList);
		System.out.println(sumArrayList(sampleList));
	
	}
	public static int sumArrayList(ArrayList<Integer> ints) {
		int sum = 0;
		
		for (int addition : ints) {
			sum = sum + addition;
		}	
		return sum;
	}
}
