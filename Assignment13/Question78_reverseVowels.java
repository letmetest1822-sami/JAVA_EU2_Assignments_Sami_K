package assignments.Assignment13;

import java.util.ArrayList;

public class Question78_reverseVowels {

	public static void main(String[] args) {
		/*
		 * Reverse a vowels of string without affecting any other characters. 
		 * Write a method reverseVowels() that will return a string with reversed vowels.

Sample Output:
     Input: str = "apple"
     Output: str = "eppla"

     Input: str = "Ab,c,de!$"
     Output: str = "eb,c,dA!$"

     Input : hello world
     Output : hollo werld

Note that only vowels were reversed.
		 */
		String input = "apple";
		
		System.out.println(reverseVowels(input));
		
	}
	public static String reverseVowels(String str) {
		
		ArrayList<Integer> vowelIndex = new ArrayList<>();
		
		for (int i = 0; i< str.length(); i++) {
			
			if ( (str.substring(i, i+1).equalsIgnoreCase("a")) || (str.substring(i, i+1).equalsIgnoreCase("e")) || (str.substring(i, i+1).equalsIgnoreCase("i")) || (str.substring(i, i+1).equalsIgnoreCase("u")) || (str.substring(i, i+1).equalsIgnoreCase("o"))){
				vowelIndex.add(str.indexOf(str.substring(i, i+1)));
			}
		}
		String swap = "";
		
		int j = vowelIndex.size()-1;
		
		int k = 0;
		
		for (int i = 0 ; i<str.length(); i++) {
			
			if(i == vowelIndex.get(k)) {
				
				swap += str.charAt(vowelIndex.get(j));
				
				k++; j--;
			}
			else {
				swap += str.charAt(i);
			}
		}
	return swap;
	}
}
