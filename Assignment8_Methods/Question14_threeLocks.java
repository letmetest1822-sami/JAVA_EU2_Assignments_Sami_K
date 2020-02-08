package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question14_threeLocks {

	public static void main(String[] args) {
		/*
		 * This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
		 * It returns true only if both a and b are true or c is true.
		 */

		Scanner bool = new Scanner (System.in);
		
			System.out.print("Please enter the first boolean statement : ");
			boolean b1 = bool.nextBoolean();
		
			System.out.print("Please enter the second boolean statement : ");
			boolean b2 = bool.nextBoolean();
		
			System.out.print("Please enter the third boolean statement : ");
			boolean b3 = bool.nextBoolean();
			
		System.out.println(threeLocks(b1, b2, b3));
		
	}
	
	public static boolean threeLocks(boolean b1, boolean b2, boolean b3) {
	
			return ((b1 && b2) || b3);
	}

}
