package assignments.Assignment11;

import java.util.Arrays;

public class Question34_reverseOrder {

	public static void main(String[] args) {
		/*
		 * Given a String variable sentence, write code to type each word in separate lines in reverse order.
		 

Sample output:

     sentence -> "Java is fun"
     Print:
     fun
     is
     Java
		 */

		String input = "Java is fun";
		reverseOrder(input);
		
		String input2 = "Hello my name is Sami";
		reverseOrder(input2);
		
	}
	public static void reverseOrder(String word) {
	
	String arr [] = word.split(" ");
	
		for (int i=arr.length-1;    i>=0;     i--) {
		
			System.out.println(arr [i]);
		}
		System.out.println();
	}
}
