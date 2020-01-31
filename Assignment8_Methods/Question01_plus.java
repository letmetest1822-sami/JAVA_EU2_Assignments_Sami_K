package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question01_plus {

	public static void main(String[] args) {
		/* Create a method called "plus", its return is void and it gets no arguments.
		 * It asks the user to input two numbers, then it will add them and print the result.
		 * Create a scanner within the plus method.

		Example:

		enter a number:
		1
		enter second number:
		2
		result: 3
		
		*/
		
plus();

	}

	public static void plus() {
		
		Scanner numbers = new Scanner (System.in);
		
		System.out.print("Please enter a number : ");
		
		int a = numbers.nextInt();

		System.out.print("Please enter another  number : ");
		
		int b = numbers.nextInt();
		
		int result = a + b;
		
		System.out.println("The sum of " + a + " + " + b +" = " + result);
	}
}
