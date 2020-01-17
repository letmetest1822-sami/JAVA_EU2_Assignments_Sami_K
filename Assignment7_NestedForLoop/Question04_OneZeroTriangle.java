package assignments.Assignment7_NestedForLoop;

public class Question04_OneZeroTriangle {

	public static void main(String[] args) {
		/* Write a Java program to print the following pattern

			1
			10
			101
			1010
			10101
			101010
			1010101
 
		 */
		
		int rows = 7;         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
              
            System.out.println();
        }
		
	}

}
