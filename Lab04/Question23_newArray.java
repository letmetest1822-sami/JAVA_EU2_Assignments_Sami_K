package assignments.Lab04;

import java.util.Arrays;
import java.util.Scanner;

public class Question23_newArray {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts a number and create and prints a new array of length
number, containing the numbers 0,1,2,...number-1.

		fizzArray(4) 	→ [0, 1, 2, 3]
		izzArray(1) 	→ [0]
		fizzArray(10) 	→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		 */

		Scanner input = new Scanner(System.in);
			System.out.print("Enter a number to indicate the length of the array : ");
			int a = input.nextInt();
			
		System.out.println(Arrays.toString(createNewArray (a)));
			
	}

	public static int [] createNewArray (int a) {
						
		int [] createNewArray = new int [a];
		
		for (int i = 0; i < a; i++) {
			createNewArray[i] = i;
		}
		return createNewArray;
	}
}
