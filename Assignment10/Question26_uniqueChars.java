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
	
		
		//for (int i=0; i<word.length();i++) {
			for( int j = 1; j<word.length()-2;   j++) {
				if(word.contains(word.substring(j+1,j+2))) {
					word.replace(word.substring(j+1,j+2), "");
				}
			}
			System.out.println(word);
			
		}
	}

