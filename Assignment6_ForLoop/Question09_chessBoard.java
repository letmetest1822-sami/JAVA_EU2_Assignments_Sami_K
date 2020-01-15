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
		
		for (int i=0; i<10;i++) {
						
			if (i%2==0) {
				System.out.print(" W ");
			}else {System.out.print(" B ");
		}
		for (int j=0; j<9;j++) {
				
			if (i%2==1) {
			System.out.print(" W ");
			}else {System.out.print(" B ");

			}

			}System.out.println();
		}
	}
}
