package assignments.day_4_arithmeticOperators;

public class Question7_VendingMachine {

	public static void main(String[] args) {
		/*Write a program that determines the change
		 * to be dispensed from a vending machine. 
		 * An item in the machine can cost between 25 cents and 1 dollar, 
		 * in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 * and the machine accepts only a single dollar bill to pay for the item.*/
		
		int itemPrice =55;
		int acceptedMoney=100;
		
		int numberOfQuarters=0;  // 25 cents
		int numberOfDimes=0;     // 10 cents
		int numberOfNickles=0;   //  5 cents
		int numberOfNickles2=0;   //  5 cents
		
		int remainder=acceptedMoney-itemPrice; //Rest of the money
		int remainder10=0; //Rest of the money after calculating the number of 5 cents
		int remainder25=0; //Rest of the money after calculating the number of 10 cents
		
		System.out.println("Rest of the money : " + remainder + "\n"); 
		
		
		numberOfNickles=(remainder%10)/5;
		System.out.println("Number of 5 cents : " + numberOfNickles);
		
		remainder10=remainder-(numberOfNickles*5);
				
		
		numberOfDimes=(remainder10%25)/10;
		System.out.println("Number of 10 cents : " + numberOfDimes);
		
		remainder25=remainder10-(numberOfDimes*10);
		
		
		numberOfQuarters=remainder25/25;
		System.out.println("Number of 25 cents : " +numberOfQuarters + "\n");	
		
		numberOfNickles2= (remainder-((numberOfQuarters*25)+(numberOfDimes*10)))/5;
		System.out.println("Correct number of 5 cents : " + numberOfNickles2 + "\n"); 
		
		//numberOfDimes=((remainder-(numberOfNickles*5)))/10;
		//System.out.println("How many 10 cents : " + numberOfDimes);
		
		//numberOfQuarters=((remainder-(numberOfDimes*10)-(numberOfNickles*5))/25);
		
		//System.out.println("How many 25 cents : " +numberOfQuarters);		
		
		System.out.println("Because we are not using if, and, or; ");
		System.out.println("in case of using quarters number of nickels are miscalculating \n");
		System.out.println("Your change is " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickles + " nickles");

	}

}
