package assignments.Assignment6_ForLoop;

public class Question04_sumOfNumbers {

	public static void main(String[] args) {
		/* Write a program to calculate the sum of the numbers from 1 till upper bound.
			If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
			If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
			If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

			You should use a while loop.*/
		
		int sum=0, i=1, upperBound=100;
		
		System.out.print( "If upper bound is " + upperBound + ", sum should be ");
		
		while (i<=upperBound) {
			
			sum+=i;		
			
			if(i==upperBound) {
				System.out.print( i );
				break;
			}
			
			System.out.print( i + " + ");
			
			i++;
		}
		
		System.out.println( " = " + sum);
	}

}
