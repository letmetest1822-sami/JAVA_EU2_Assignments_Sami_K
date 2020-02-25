package assignments.Assignment10;

public class Question18_wordAndSeperator {

	public static void main(String[] args) {
		/*
		 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
		 */

	String	input1 = "Word";
	String  input2 = "X";
	int    count1 = 3;
	
	String	input3 = "This";
	String  input4 = "And";
	int    count2 = 2;
	
	String	input5 = "This";
	String  input6 = "And";
	int    count3 = 1;
		
		wordAndSeperator (input1, input2, count1);	
		wordAndSeperator (input3, input4, count2);
		wordAndSeperator (input5, input6, count3);
	}

	public static void wordAndSeperator (String word, String seperator, int repeat) {
		String result = word;
		for( int i = 0; i<repeat-1; i++) {
			result += seperator;
			result += word;
		}
		
	System.out.println(result);
	}
}
