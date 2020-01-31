package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question06_next3 {

	public static void main(String[] args) {
		/*
		 * Create a method called next3 . 
		 * This method gets an int argument and prints the next 3 numbers after that number. 
		 * Call the method from main method and pass num to it.

		enter number
				1
		next 3 are:
		2 3 4

		(put a space between numbers)
		 */

		
		next3();
	}
	
	public static void next3() {
				
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter a number : ");
		
		int a = number.nextInt();
		
		System.out.println("The next 3 numbers are : ");
		
		System.out.println ((a+1) + " " +  (a+2) + " " + (a+3) );
	}

}
