package assignments.Assignment12;

import java.util.Arrays;

public class Question54_values2Darray {

	public static void main(String[] args) {
		/*
		 * Declare and create a two-dimensional array of ints called values, 
		 * with 2 rows, and initialize the 
		 * first  row to  8, 20, 50 and the 
		 * second row to 12, 30, 75

Sample output:
     [[8, 20, 50], [12, 30, 75]]
		 */
		values();
	}
public static int [][] values(){
	int [][] numbers = new int [2][3] ;
	
	numbers [0][0] = 8;
	numbers [0][1] = 20;
	numbers [0][2] = 50;
	
	numbers [1][0] = 12;
	numbers [1][1] = 30;
	numbers [1][2] = 75;	
	
	System.out.println(Arrays.deepToString(numbers));
	
	return numbers;
}
}
