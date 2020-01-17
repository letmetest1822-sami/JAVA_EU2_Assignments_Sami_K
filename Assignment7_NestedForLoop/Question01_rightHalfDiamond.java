package assignments.Assignment7_NestedForLoop;

public class Question01_rightHalfDiamond {

	public static void main(String[] args) {
		/* Write a Java program to print the following pattern

				1
				12
				123
				1234
				12345
				123456
				1234567
				123456
				12345
				1234
				123
				12
				1

		 */
		
		  // Begin to form the Upper half

		for (int i=1;    i<=7;    i++) {	// use i to form the rows. It will also limit j
			
			for (int j=1;   j<=i;   j++) {	//Use j to print numbers. All rows will start with 1
				
				System.out.print(j);
				
			}System.out.println();
		}
		// Form the Lower half
		
		for (int i=6; i>=1 ;i--) {	// again use i to keep forming the rows. Start form six which will again limit j
			
			for (int j=1;  j<=i;  j++) {	//Keep Using j to print numbers. All rows will again start with 1
				
			System.out.print(j);
			
			}System.out.println();
		}
	}

}
