package assignments.Assignment5;

public class Question03_positiveNegative {

	public static void main(String[] args) {
		/* Declare and assign value for a number variable
		 * Using Multi-Branch if statements, check if the number is positive, negative or zero. 
		 * Please follow the below examples and print message accordingly:

				number = -10
				10 is positive

				number = -55
				-55 is negative

				number = 0
				it is zero*/
		int number = 0;
		
		if (number > 0) {
			System.out.println( number+ " is positive." );
			
		}else if (number < 0) {
			System.out.println( number+ " is negative." );
		
		}else if (number == 0) {
			System.out.println( number+ " is zero." );
		}
	}

}
