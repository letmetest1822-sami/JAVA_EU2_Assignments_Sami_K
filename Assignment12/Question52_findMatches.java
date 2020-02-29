package assignments.Assignment12;

public class Question52_findMatches {

	public static void main(String[] args) {
		/*
		 * You get a 2d array and 
		 * you need to find how many two matches there are and 
		 * return the number(int) of matches you found.

For example: 
1 and 2 are not a match, 
2 and 2 are a match.
a match in this case is two numbers in a row that are equal .

Sample output:
     [2,2,1,3,4,5]
     [5,2,3,3,4,5]
     [3,2,3,1,4,5]

     print
     matches: 2
		 */
		int input [][] = {{2,2,1,3,4,5}, {5,2,3,3,4,5}, {3,2,3,1,4,5} };
		findMatches(input);
	}
	public static void findMatches(int [] [] numbers) {
		
		int countMatch = 0;
	
		for (int i = 0; i<numbers.length;i++) {
			
			for(int j = 0; j<numbers[i].length-1;j++) {
				
				if(numbers[i][j] == numbers[i][j+1]) {
					
					countMatch++;
				}
				
			}
		}
		System.out.println(countMatch);
	}
}
