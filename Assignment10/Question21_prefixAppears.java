package assignments.Assignment10;

public class Question21_prefixAppears {

	public static void main(String[] args) {
		/*
		 * Given a string, consider the prefix string made of the first n chars of the string. 
		 * Does that prefix string appear somewhere else in the string?
		 * Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only
		 */

		String input1  = "abXYabc";
		String input2  = "abXYabc";
		String input3  = "abXYabc";
		
	    int numberOfLetters1 =  1;
	    int numberOfLetters2 =  2;
	    int numberOfLetters3 =  3;
	    
	    prefixAppears(input1, numberOfLetters1);
	    prefixAppears(input2, numberOfLetters2);
	    prefixAppears(input3, numberOfLetters3);
	}

	public static void prefixAppears(String word, int len) {
		
		String search = word.substring(0, len);
		
		int countSearch = 0 ;
		
		boolean flag = false;
		
		for (int i = 0; i<word.length();i++) {
			
			if((word.charAt(i) == search.charAt(0)) && (word.substring(i, i+len)).equalsIgnoreCase(search)) {
				
				countSearch++;
			}
		}
		if(countSearch>=2) {
			flag = true;
		}
		if (countSearch == 1) {
			System.out.println(flag);
			System.out.println(search + " appears only once\n");
		}
		else if (countSearch == 2) {
			System.out.println(flag);
			System.out.println(search + " appears twice\n");
		}
		else {
			System.out.println(flag);
			System.out.println(search + " appears "+ countSearch + " times\n");
		}
	}
}
