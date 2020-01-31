package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question02_cube {

	public static void main(String[] args) {
		/* 
		 * Create a method called cube. 
		 * Write all required code inside this method in order to 
		 * ask the user for a number and then prints the cubed value of that number:

		Example:

			input: 5
			output: 125
		 */

		cube();
	}

	public static void cube() {
		
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter a number : ");
		
		int a = number.nextInt();

		int result = a*a*a;
		
		System.out.println("The cube of " + a + " = " + result);

	}
}
