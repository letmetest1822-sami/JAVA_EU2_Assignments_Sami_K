package assignments.Assignment6_ForLoop;

public class Question03_divisibleBy5 {

	public static void main(String[] args) {
		/* Write a Java program to print all the numbers between 1 and 100 
		 * (including 1 and 100) which are divisible by 5.
		 */
		
		for (int i=1; i<=100;i++) {
			
			if(i%5==0) {
				if(i==100) {
					System.out.print(i );
					break;
				}
				System.out.print(i + ", ");
			}
		}
	}

}
