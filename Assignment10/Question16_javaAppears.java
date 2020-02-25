package assignments.Assignment10;

public class Question16_javaAppears {

	public static void main(String[] args) {
		/*
		 * Given a string word, print true if "java" appears 
		 * starting at index 0 or 1 in the string, 
		 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
		 * The string should be 4 and more characters.

			Sample Output:
     				input	: javapython
    				output	: true

     				input	: cjavac++
     				output	: true

     				input	: c#javaruby
     				output	: false
		 */

		String input =  "javapython";
		String input1 =  "cjavac++";
		String input2 =  "c#javaruby";
		
		System.out.println( javaAppears(input));
		System.out.println( javaAppears(input1));
		System.out.println( javaAppears(input2));
		
	}

	public static boolean javaAppears (String word) {
		
		boolean flag = false;
		
		if ((word.length()>=4) && (((word.charAt(0) == 'j') && word.substring(0, 4).equalsIgnoreCase("java") )|| ((word.charAt(1) == 'j') && word.substring(1, 5).equalsIgnoreCase("java")))){
			
			flag = true;
		}
		return flag;
	}
}
