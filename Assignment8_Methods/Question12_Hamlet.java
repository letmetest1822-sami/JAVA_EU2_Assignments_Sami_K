package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question12_Hamlet {

	public static void main(String[] args) {
		/*
		 *The danish prince most famous quote is "to be or not to be". 
		 *thats a classic example of boolean logic.
		 *the hamletQuote method only returns true if one of or both of the boolean parameters is true.
		 

			example:

				hamletQuote(true, false)
					returns true

				hamletQuote(false,true)
					returns true

				hamletQuote(true,true)
					returns true

				hamletQuote(false,false)
					returns false
		 */
		
		System.out.println(hamletQuote());
		
	}
	
	public static boolean hamletQuote() {
	
	Scanner bool1 = new Scanner (System.in);
	
		System.out.print("Please enter the first boolean statement : ");

		boolean b1 = bool1.nextBoolean();
	
	Scanner bool2 = new Scanner (System.in);
	
		System.out.print("Please enter the second boolean statement : ");

		boolean b2 = bool2.nextBoolean();
	
	return (b1||b2);
	}
}
