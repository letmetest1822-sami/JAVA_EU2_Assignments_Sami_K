package assignments.Assignment11;

public class Question33_firstAndLastLetter {

	public static void main(String[] args) {
		/*
		 * Given a String array words, iterate through each word and print the first and 
		 the last letter of each element in separate lines.

Sample output:

     words → ["hello", "why", "by", "apple" , "note"]
     print:
     ho
     wy
     by
     ae
     ne
		 */
		String input1 [] = {"hello", "why", "by", "apple", "note"};
		
		firstAndLastLetter(input1);
	}
	public static void firstAndLastLetter(String [] words) {
		
		for (int i=0; i<words.length;i++){
			
			System.out.println((words[i].substring(0,1)+(words[i].substring(words[i].length()-1))));
		}
	}
}
