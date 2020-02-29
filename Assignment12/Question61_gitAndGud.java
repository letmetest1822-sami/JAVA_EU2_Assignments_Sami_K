package assignments.Assignment12;

import java.util.ArrayList;

public class Question61_gitAndGud {

	public static void main(String[] args) {
		/*
		 * Write a method that will take an argument of String ArrayLists called words, 
		 * and then set the 0th and 2nd indexes to be "git" and "gud" respectively.
		 */
		
		ArrayList<String> sampleList = new ArrayList<>();
			sampleList.add("pencil");
			sampleList.add("notebook");
			sampleList.add("sharpener");
		
		gitAndGud(sampleList);
	}
	public static void gitAndGud(ArrayList<String> arrayList1) {
		
		arrayList1.set(0,"git");
		arrayList1.set(2,"gud");
		
		System.out.println(arrayList1.toString());
	}
}
