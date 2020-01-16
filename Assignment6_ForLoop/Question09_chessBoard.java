package assignments.Assignment6_ForLoop;

public class Question09_chessBoard {

	public static void main(String[] args) {
		/* Print following chessboard using nested for loops.
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W
			W B W B W B W B
			B W B W B W B W

			NOTE:
			1. Total 8 rows and 8 columns.
			2. "W" and "B" are in alternate positions (row-wise or column-wise), 
			you will not find consecutive W or B.*/
		
		for (int i=0;     i<10;     i++) {
							
			for (int j=1;    j<9;   j++) {
				
				if ( (i%2==0) ^ (j%2==1) ) {
			
					System.out.print(" B ");
			
				}else {System.out.print(" W ");
				}
			}System.out.println();
		}
	}
}
