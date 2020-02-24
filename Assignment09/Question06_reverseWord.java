package assignments.Assignment09;

import java.util.Scanner;

public class Question06_reverseWord {

	public static void main(String[] args) {
		/*
		 * Write a program that will reverse a string. 
		 * Your program should reverse a string only 5 characters long. 
		 * If the word is shorter, display message: "Too short!". 
		 * If the word is longer, display the message: "Too long!". 
		 * Otherwise, reverse this word and print out the result into the console.

			Sample Output:

     		input	: cat
     		output	: Too short!

     			input	: singularity
     			output	: Too long!

     				input	: apple
     				output	: elppa
		 */

	Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a word : ");
		String word = input.next();
			
	reverseWord(word);
}
public static void reverseWord(String word) {
	
	int len = word.length();
		
	String reversed = "";
	
	if (len < 5) {
		System.out.println("Too short!");
	}	
		
	else if (len > 5) {
		System.out.println("Too long!");
	}
	
	else if (len == 5) {

		for (int i = len-1; i>=0; i--){
			reversed += word.charAt(i);
		}
		System.out.println(reversed);
	}
	
}
}

