package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question14_threeLocks {

	public static void main(String[] args) {
		/*
		 * This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
		 * It returns true only if both a and b are true or c is true.
		 */

		System.out.println(threeLocks());
		
		
	}
	
	public static boolean threeLocks() {
		
		Scanner bool1 = new Scanner (System.in);
		
			System.out.print("Please enter the first boolean statement : ");

			boolean b1 = bool1.nextBoolean();
			
	
		Scanner bool2 = new Scanner (System.in);
	
			System.out.print("Please enter the second boolean statement : ");

			boolean b2 = bool2.nextBoolean();
			
		
		Scanner bool3 = new Scanner (System.in);
			
			System.out.print("Please enter the third boolean statement : ");

			boolean b3 = bool3.nextBoolean();	
			
			return ((b1 && b2) || b3);
	}

}
