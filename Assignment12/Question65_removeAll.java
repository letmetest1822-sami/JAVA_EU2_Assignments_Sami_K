package assignments.Assignment12;

import java.util.ArrayList;

public class Question65_removeAll {

	public static void main(String[] args) {
		/*
		 * Create a method that is called removeAll takes two parameters: 
		 * an ArrayList of Strings called wordList, and a String called targetWord and returns nothing
		 * This method should go through every element of wordList and 
		 * remove every instance of targetWord from the ArrayList.
		 */

		ArrayList<String> inputAL = new ArrayList<>();
		
		inputAL.add("Java");
		inputAL.add("English");
		inputAL.add("Python");
		inputAL.add("Turkish");
			
	System.out.println(inputAL.toString());
	
	String inputWord = "Java";
	
		
	removeAll(inputAL, inputWord);
	
	}
	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		
		
		for (int i=0 ; i<wordList.size() ; i++) {
			
			if (wordList.get(i) == targetWord) {
				
				wordList.remove(i);
			}
		}
	System.out.println(wordList);
	}
}
