package assignments.Assignment6_ForLoop;

public class Question06_numberPyramid {

	public static void main(String[] args) {
		/* Print following output using nested for loops:
			1
			22
			333
			4444
			55555
			666666
			7777777			*/
		
		for (int i=0; i<8; i++) {
			
			for (int j=0; j<i; j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
