package assignments.Assignment13;

public class Question80_scoreCenturies {

	public static void main(String[] args) {
		/*
		 * short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		 * Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
		 * To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
		 * If the score is greater than or equal to 50 but less than 100, it is regarded as a half-century.
		 * If the score is greater than or equal to 100 but less than 200, it is regarded as a century.
		 * If the score is greater than or equal to 200, it is regarded as a double-century.
	
	NOTE: No scenario of the triple-century in this case.
		 * Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.


		 */

		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		byte countHalfCentury = 0;
		byte countCentury = 0;
		byte countDoubleCentury = 0;
		
		for ( byte i = 0;     i<scores.length;     i++) {
			
			if(scores[i] >= 200) {
				
				countDoubleCentury++;
			}
			else if(scores[i] >= 100) {
				
				countCentury++;
			}
			else if(scores[i] >= 50) {
				
				countHalfCentury++;
			}
		}
		System.out.println("Half-Centruies   : " + countHalfCentury);
		System.out.println("Centruies        : " + countCentury);
		System.out.println("Double-Centruies : " + countDoubleCentury);
	}

}
