package assignments.Assignment12;

import java.util.ArrayList;

public class Question68_addElements {
	public static void main(String[] args) {
		/*
		 * Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. 
		 * You can assume that each array has 5 elements

	addElements(
	new int[][10, 40, 50, 3, 1],
	new int[][11, 0, 500, 44, 1101]);
	--------
	return array after adding values in the arrays:
	[21, 40, 550, 47, 1102]
		 */
		ArrayList<Integer> IntegerList1 = new ArrayList<>();
		
		IntegerList1.add(10);
		IntegerList1.add(40);
		IntegerList1.add(50);
		IntegerList1.add(3);
		IntegerList1.add(1);
		
		System.out.println(IntegerList1);
		
		ArrayList<Integer> IntegerList2 = new ArrayList<>();
		
		IntegerList2.add(11);
		IntegerList2.add(0);
		IntegerList2.add(550);
		IntegerList2.add(47);
		IntegerList2.add(1102);
		
		System.out.println(IntegerList2);
		
		System.out.println(addElements(IntegerList1, IntegerList2));
	}
	
	public static ArrayList<Integer> addElements(ArrayList<Integer> AL1, ArrayList<Integer> AL2 ){
		
		ArrayList<Integer> IntegerListSum = new ArrayList<>();
		
		for (int i=0; i<AL1.size(); i++) {
			
			IntegerListSum.add(AL1.get(i)+AL2.get(i));
		}
		
		return IntegerListSum;
	}
}
