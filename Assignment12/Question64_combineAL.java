package assignments.Assignment12;

import java.util.ArrayList;

public class Question64_combineAL {

	public static void main(String[] args) {
		/*
		 * Create a method that is called combineAL takes two parameters: 
		 * an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2 
		 * and returns an ArrayList
		 
		 * This method should create a new ArrayList of Strings, 
		 * add all the words (in order) from wordList1, 
		 * then add all the words (in order) from wordList2. 
		 * In other words, it is combining all the elements from the two parameters.
		 */
		
		ArrayList<String> input1 = new ArrayList<>();
		
			input1.add("Java");
			input1.add("English");
		
		ArrayList<String> input2 = new ArrayList<>();
		
			input2.add("Python");
			input2.add("Turkish");
			
		
		System.out.println(input1.toString());
		System.out.println(input2.toString());
		
		System.out.println(combineAL(input1, input2));
	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
		
		ArrayList<String> wordListCombined = new ArrayList<>();
		
			for (String each : wordList1) {
				wordListCombined.add(each);
			}
			for (String each : wordList2) {
				wordListCombined.add(each);
			}
		
			return wordListCombined;
	}
}
