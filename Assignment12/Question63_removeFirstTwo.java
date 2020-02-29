package assignments.Assignment12;

import java.util.ArrayList;

public class Question63_removeFirstTwo {

	public static void main(String[] args) {
		/*
		 * Write a method that will take an argument of ArrayList of Doubles called doubles,
		 * and remove the first two elements in ArrayList and return the final list.
		 */

		ArrayList<Double> doubles= new ArrayList<>();
		
		doubles.add(1.1);
		doubles.add(2.2);
		doubles.add(3.3);
		doubles.add(4.4);
		doubles.add(5.5);
		
		System.out.println(doubles);
		System.out.println(removeFirstTwo(doubles));
	}
	public static ArrayList<doubles> removeFirstTwo(ArrayList<Double> doubles) {
		doubles.remove(0);
		doubles.remove(1);
		
		return doubles;
}
}
