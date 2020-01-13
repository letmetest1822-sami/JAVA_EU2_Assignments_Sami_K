package assignments.Assignment5;

import java.util.Scanner;

public class Question09_slice_integer {

	public static void main(String[] args) {
		/*In this task, you need to slice an integer and print numbers one by one from the new line.
			Example # 1
			Your number: 12345
					-Display prompt: 1
					-Display prompt: 2
					-Display prompt: 3
					-Display prompt: 4
					-Display prompt: 5       */
		//int number = 12345;
		
		 int number;
	        Scanner keyboard = new Scanner (System.in);
	        System.out.println ("Please enter an integer with"
	        		+ " 9 digits.");
	        number = keyboard.nextInt( );
	        System.out.println (number / 100000000);
	        number = number % 100000000;
	        System.out.println (number / 10000000);
	        number = number % 10000000;
	        System.out.println (number / 1000000);
	        number = number % 1000000;
	        System.out.println (number / 100000);
	        number = number % 100000;
	        System.out.println (number / 10000);
	        number = number % 10000;
	        System.out.println (number / 1000);
	        number = number % 1000;
	        System.out.println (number / 100);
	        number = number % 100;
	        System.out.println (number / 10);
	        System.out.println (number % 10);
	}

}
