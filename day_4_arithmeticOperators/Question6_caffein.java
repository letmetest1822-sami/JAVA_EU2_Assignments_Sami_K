package assignments.day_4_arithmeticOperators;

public class Question6_caffein {

	public static void main(String[] args) {
		/*Write a program with a variable that holds 
		 * the number of milligrams of caffeine
		 * in a drink and outputs how many drinks it takes to kill a person.*/

		int mgCaffein_ounce12_can = 34;
		int mgCaffein_ounce16_cup = 160;
		
		int LethalnumberOfCans;
		int LethalnumberOfCups;
		
		LethalnumberOfCans =  (10_000/mgCaffein_ounce12_can)+1;  // We add one because the result is 62.5
		LethalnumberOfCups =  (10_000/mgCaffein_ounce16_cup)+1; // We add one because the result is 294.12
		
		System.out.println("Number of milligrams in a (16-ounce) cup of coffee:  " + mgCaffein_ounce16_cup +" mgs");
		System.out.println("It would take about " + (LethalnumberOfCups) + " cups of coffee for a lethal overdose");
		
		System.out.println("\nNumber of milligrams in a (12-ounce) can of cola :  " + mgCaffein_ounce12_can +" mgs");
		System.out.println("It would take about " + (LethalnumberOfCans) + " cans of cola for a lethal overdose");
	
	}

}
