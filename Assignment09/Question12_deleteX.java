package assignments.Assignment09;

public class Question12_deleteX {

	public static void main(String[] args) {
		/*
		 * Given a string word, 
		 * if the first or last chars are 'x' or 'X', 
		 * print the string without those 'x' or 'X' chars, 
		 * otherwise print the string unchanged.

			Sample output:

     	input	: xHiX
     	output	:  Hi
     	--------------
     	input	: apple
     	output 	: apple
     	--------------
     	input	: xUxL
     	output	:  UxL
     	--------------
     	input	: JavaX
     	output	: Java
     	
		 */
		
		String input1 = "xHiX";
		String input2 = "apple";	
		String input3 = "xUxL";
		String input4 = "JavaX";
		String input5 = "Sami";
	   
		deleteX(input1);
		deleteX(input2);
		deleteX(input3);
		deleteX(input4);
		deleteX(input5);
	
	}
	public static void deleteX(String word){
		
		if (!(word.substring(0,1).equalsIgnoreCase("x")) && (word.substring(word.length()-1).equalsIgnoreCase("x"))){
			System.out.println(word.substring(0, word.length()-1));
		}
		
		else if ((word.substring(0,1).equalsIgnoreCase("x")) && !(word.substring(word.length()-1).equalsIgnoreCase("x"))){
			System.out.println(word.substring(1));
		}
		
		else if ((word.substring(0,1).equalsIgnoreCase("x")) && ((word.substring(word.length()-1).equalsIgnoreCase("x")))) {
			System.out.println(word.substring(1, word.length()-1));
		}
		
		else {
			System.out.println(word);
		}
	}
}
