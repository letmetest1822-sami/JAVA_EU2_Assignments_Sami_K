package assignments.Assignment6_ForLoop;

public class Question07_PyramidCentered {

	public static void main(String[] args) {
		/*Print the following output using nested for loops.

			4       3       2      1

     			3       2      1

         			2       1

              			1						*/
		for (int i=4;  i>=1;  i--) {
				
			for (int j=i;   j>=1;  j--) {
				System.out.print("  " + j + "  ");
			}
				
			System.out.println();
			System.out.print("   ");
		}
	}
}

