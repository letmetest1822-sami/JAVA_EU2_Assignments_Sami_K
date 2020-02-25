package assignments.Assignment10;

public class Question28_cleanBadWord {

	public static void main(String[] args) {
		/*
		 * This method gets two strings (text and badWord) and returns a string.
		 * Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said "
		 */

		System.out.println(cleanBadWord ("one two three","two"));
		System.out.println(cleanBadWord ("foo bar","foo"));
		System.out.println(cleanBadWord ("he said bla bla bla","bla"));
		 
	}
	public static String cleanBadWord(String word1, String word2) {
		
		String cleanWord = "";
		
		if (word1.contains(word2)) {
			
		cleanWord = word1.replace(word2+" ", "").trim();
		}
		return cleanWord;
	}
}
