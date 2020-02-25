package assignments.Assignment10;

public class Question20_factorial {

	public static void main(String[] args) {
		/*
		 * In mathematics, the factorial of a positive integer n, denoted by n!, 
		 * is the product of all positive integers less than or equal to n. 
		 * Calculate factorial and output result to the console.

Sample Output:

     input: 5
     output: 120

		 */
		int input1 = 5;
		int input2 = 6;
		
		System.out.println(factorial(input1));
		System.out.println(factorial(input2));
		
	}
	public static int factorial(int number) {
	
		int result = 1;
	
		for (int i = number; i>0; i--) {
		
			result = result * i;
		}
	return result;
	}
}
