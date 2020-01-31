package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question05_sign {

	public static void main(String[] args) {
		/*
		 * Create a method called sign. 
		 * It gets a number and tells you if its positive, negative or zero.

		for example :
			sign(5)    =>  1
			sign(-30)  => -1
			sign(0)    =>  0

			sign gets an int parameter.

			print out 1, -1 or 0 depending on the input

			the parameter should be entered by user (create a scanner object)
		 */

		sign ();
		
	}
	public static void sign () {
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter a number : ");
		
		int a = number.nextInt();
		
		if (a>0) {
			System.out.println("1");
		}else if (a==0) {
			System.out.println("0");
		}else if (a<0) {
			System.out.println("-1");
		}

	}

}
