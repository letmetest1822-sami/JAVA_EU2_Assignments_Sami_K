package assignments.Assignment11;

import java.util.Arrays;

public class Question35_reversedSentence {

	public static void main(String[] args) {
		/*
		 * Given a String variable sentence, 
		 * write code to get each word and assign it to String reversed in reverse order.

Sample output:
     sentence -> "Java is fun"
     reversed -> "fun is Java"
		 */
		String input = "Java is fun";
		reversedSentence(input);
		
		String input2 = "Hello my name is Sami";
		reversedSentence(input2);
		
	}
	public static void reversedSentence(String word) {
	
	String arr [] = word.split(" ");
	
	String reversedWord = "";
	
	
		for (int i=arr.length-1;    i>=0;     i--) {
			reversedWord += arr [i]+" ";
			
		}
		System.out.println(reversedWord);
	}
		

}
