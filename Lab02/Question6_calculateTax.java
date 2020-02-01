package assignments.Lab02;

import java.util.Scanner;

public class Question6_calculateTax {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask the user to enter the amount of a purchase. 
		 * The program should then compute the state and county tax sales tax. 
		 
		 * Assume the 
		 		state sales tax is 4 percent and 
		 		the county sales tax is 2 percent. 
		 		
		 * The program should display 
		  		the amount of the purchase , 
		  		the state sales tax, 
		  		the county sales tax, 
		  		the total sales tax, and 
		  		the total of the sale 
		  						(which is the sum of the amount of purchase plus the total sales tax)

 
		 */

		
		calculateTax();
	}
	public static void calculateTax() {
		
		Scanner number = new Scanner(System.in);
		
			System.out.print("Enter the amount of the purchase : ");
			
			double amountOfPurchase = number.nextDouble();
			double stateSalesTax = amountOfPurchase * 0.04;
			double countySalesTax = amountOfPurchase * 0.02;
			double totalTax = stateSalesTax + countySalesTax;
			double grandTotal = totalTax + amountOfPurchase;
		
			System.out.println("\nThe amount of the purchase is : " + amountOfPurchase + " $");
			System.out.println("The  state  sales tax is : " + stateSalesTax + " $");
			System.out.println("The  county sales tax is : " + countySalesTax + " $");
			System.out.println("The  total  sales tax is : " + totalTax + " $");
			System.out.println("The total of the sale is : " + grandTotal + " $");
	  		
	  	

	}
}
