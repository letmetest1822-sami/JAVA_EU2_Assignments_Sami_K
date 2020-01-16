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
				System.out.print(j + "   ");
			}
			System.out.println();
						
			
			/* 
			 for(int k=i; k<1; k--) {    // i=4  -> print 1 space 
				System.out.print("  ");  // i=3  -> print 2 space
			}							 // i=2  -> print 3 space
			
			// fails
			
			*/
						
			
			System.out.print("  ");
			
			if(i<4) {
				System.out.print("  ");
				if(i<3) {
					System.out.print("  ");
				}
			}
			
			
		}
	}
}


