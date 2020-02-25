package assignments.Assignment10;

public class Question30_at3 {

	public static void main(String[] args) {
		/*
		 * at3 method gets two strings and returns a string. 
		 * The first string is the one that will be manipulated. 
		 * At the 3rd char position of the target you will insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla"
		 */

		at3("longword","foo");
		at3("blabla","a");
	}
	public static void at3(String word1, String word2) {
		
		System.out.println(word1.substring(0,3)  +  (word2)  +  word1.substring(3)); 
	}
}
