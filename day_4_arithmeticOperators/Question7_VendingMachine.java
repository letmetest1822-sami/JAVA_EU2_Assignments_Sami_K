package assignments.day_4_arithmeticOperators;

public class Question7_VendingMachine {

	public static void main(String[] args) {
		/*Write a program that determines the change
		 * to be dispensed from a vending machine. 
		 * An item in the machine can cost between 25 cents and 1 dollar, 
		 * in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 * and the machine accepts only a single dollar bill to pay for the item.*/
		
		int itemPrice =45;
		int acceptedMoney=100;
		
		int numberOfQuarters=0;  // 25 cents
		int numberOfDimes=0;     // 10 cents
		int numberOfNickles=0;   //  5 cents
		
		int remainder=acceptedMoney-itemPrice; //Rest of the money
		int remainder10=0; //Rest of the money after calculating the number of 10 cents
		int remainder25=0; //Rest of the money after calculating the number of 25 cents
		
		System.out.println("Rest of the money : " + remainder + "\n"); 
		
		numberOfQuarters=(remainder - remainder%25)/25;
		System.out.println("Number of 25 cents : " +numberOfQuarters + "\n");	
		
		remainder25=remainder-(numberOfQuarters*25);
		
		numberOfDimes=(remainder25-remainder25%10)/10;
		System.out.println("Number of 10 cents : " + numberOfDimes+ "\n");
		
		remainder10=remainder25-(numberOfDimes*10);
		
		numberOfNickles=(remainder10-remainder%5)/5;
		System.out.println("Number of 5 cents : " + numberOfNickles+ "\n");
		
		
		System.out.println("Your change is " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickles + " nickles");

	}

}
