package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question10_isEven {

	public static void main(String[] args) {
		/*
		 *isEven method gets a number(int) if its even (2,4,8...) returns true.
		 *if its odd return false.

			for example:

				isEven(1) --> false

				isEven(8) --> true
		 */

		System.out.println(isEven());
		
		System.out.println(isEven());
		
	}

	public static boolean isEven() {
		
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter a number : ");
	
		int a = number.nextInt();
		
		if (a%2 == 0) {
			return true;
			
		}else {
			return false;
		}
	
	}
}
