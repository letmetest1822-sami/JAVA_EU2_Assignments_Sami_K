package assignments.Assignment10;

public class Question26_uniqueChars {

	public static void main(String[] args) {
		/*
		 * uniqueChars is a method that you will code now, 
		 * should be able to accept any string in the word and 
		 * return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"
		 */

		uniqueChars("java");
	    uniqueChars("mama");
	    uniqueChars("spoon");
	
	}
	public static void uniqueChars(String word) {
	
		String unique = " ";
		
        for (int i=0 ; i<word.length(); i++) {
        	
        	if (unique.indexOf(word.charAt(i))==-1) {
        		
	        	unique = unique+(word.charAt(i));
		    }
	    }
        System.out.println(unique);
	}
}
