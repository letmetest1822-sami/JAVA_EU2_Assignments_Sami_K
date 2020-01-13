package assignments.Assignment5;

public class Question04_EvenOdd {

	public static void main(String[] args) {
		/* Declare and assign value for a number variable
		 * Using conditional statements, check if the number is odd or even. 
		 * Please follow the below examples and print message accordingly:

				number = 10
				10 is even

				number = 33
				33 is odd

				number = 0
				0 is even    */
		
		int number = 0;
		
		if (number%2 == 0) { 
			System.out.println( number +" is even");
			
		}else  if (number%2 == 1) { 
			System.out.println( number +" is odd");
			
		}else if (number == 0) { 
			System.out.println( number +" is even");
			
		}
			 

	}

}
