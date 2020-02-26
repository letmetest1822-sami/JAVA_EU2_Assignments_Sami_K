package assignments.Assignment11;

import java.util.Arrays;

public class Question42_fewValues {

	public static void main(String[] args) {
		/*
		 * Given a String array arr with the following elements ["zero", "one", "two","three","four"]
		 * Create another array fewValues and copy words that have letter "e" in them. 
		 * You need to know how many element contain "e" and create array accordingly
		 * Values in fewValues array need to be["zero", "one","three"]

Sample Output::
     arr -> ["aa", "be", "lol", "lel", "oreo"]
     fewValues -> ["be", "lel", "oreo"]

     arr -> ["e", "hey", "bye", "furey", "spoon"]
     fewValues ->["e", "hey", "bye", "furey"]
		 */

		String [] input = {"zero", "one", "two","three","four"};
		String [] input2 = {"aa", "be", "lol", "lel", "oreo"};
		String [] input3 = {"e", "hey", "bye", "furey", "spoon"};
		
		System.out.println(Arrays.toString(fewValues(input))); 
		System.out.println(Arrays.toString(fewValues(input2))); 
		System.out.println(Arrays.toString(fewValues(input3))); 
	}
	public static String [] fewValues(String [] arr) {
		
		int len = 0;
		int j = 0;
		
			for (int i =0; i< arr.length; i++) {
			
				if( (arr[i]).contains("e")) {
					len++;
				}
			}
		String [] fewValues = new String[len];
			for (int i =0; i< arr.length; i++) {
				if( (arr[i]).contains("e")) {
					fewValues[j] = arr[i];
					j++;
				}
			}
	return fewValues;	
	}
}
