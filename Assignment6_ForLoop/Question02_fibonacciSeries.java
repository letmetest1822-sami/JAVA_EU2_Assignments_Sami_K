package assignments.Assignment6_ForLoop;

public class Question02_fibonacciSeries {

	public static void main(String[] args) {
		/* Write a program to print Fibonacci series of n terms 
		 * where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......*/
		
		int sumOf2Terms, numberOfTerms = 9, term1 = 0, term2 = 1;
		
		for (int i=0;   i<=numberOfTerms;   i++) {
			
			if (i==numberOfTerms) {
				System.out.print(term1);
				break;}
			
			System.out.print(term1 + ", ");
			
			sumOf2Terms = term1 + term2;
			
			term1 = term2;
			
			term2 = sumOf2Terms;
				
		}
					
	}

}
