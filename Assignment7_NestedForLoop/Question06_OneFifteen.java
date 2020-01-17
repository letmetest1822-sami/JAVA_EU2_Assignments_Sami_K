package assignments.Assignment7_NestedForLoop;

public class Question06_OneFifteen {

	public static void main(String[] args) {
		/*Write a Java program to print the following pattern

			1
			2 6
			3 7 10
			4 8 11 13
			5 9 12 14 15

		 */
		

		for (int i = 1; i <= 5; i++) 
        {
            int k = i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(k+" ");
                 
                k = k+5-j;
            }
             
            System.out.println();
        }
	}

}
