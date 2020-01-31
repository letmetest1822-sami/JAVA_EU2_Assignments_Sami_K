package assignments.Assignment8_Methods;

import java.util.Scanner;

public class question08_Fibonacci {

	public static void main(String[] args) {
		/*
		 * Complete a method fib() that will compute Fibonacci numbers
		 * In fibonacci series, next number is the sum of previous two numbers 
		 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
		 * The first two numbers of fibonacci series are 0 and 1.
		 
		 * Given a number num, print n-th Fibonacci Number.

			Input : 2
			Output : 1

			Input : 9
			Output : 21
		 */

		
		fib();
		
		
	}
public static void fib() {
	
	Scanner number = new Scanner (System.in);
	
	System.out.print("Please enter a number : ");
	
	int num = number.nextInt();
	
		
	//String fibonacci = "0";
	//String i_th = "1";
	
	int seri1 = 0, seri2 = 1, sum = 0;
	
		for (int i = 2;     i<=num;    i++ ) {
				
			sum = seri1 + seri2;
				
			seri1 = seri2;
			
			seri2 = sum ;
		
			//fibonacci = fibonacci  + ", " + seri1;
			//i_th = i_th + ", " + (i);
	}
	System.out.println(seri1);
	//System.out.println(fibonacci);
	//System.out.println(i_th);
}
}
