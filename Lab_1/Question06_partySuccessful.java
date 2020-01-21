package day14_MethodsContinue.Lab_1;

public class Question06_partySuccessful {

	public static void main(String[] args) {
		/*
		 * When chipmonks get together for a party, they like to have cigars.
		 * A chipmonk party is successful when the number of cigars is between 40 and 60.
		 * Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
		 * Write a method that accepts number of cigars and a boolean for weekend, 
		 * and prints true if the party with the given value is successful,
		 * or false otherwise.
		 */

		partySuccessful(30,false);
		partySuccessful(40,false);
		partySuccessful(90,false);
		partySuccessful(90,true);
	}

	public static void partySuccessful(int numberOfCigars, boolean isWeekend ) {
		
		if ( ((  (numberOfCigars>=40)  &&  (numberOfCigars<=60)   )    &&     (  isWeekend==false   )  ) 
				|| (   (numberOfCigars>=40)  &&  (isWeekend==true)  )  ) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
