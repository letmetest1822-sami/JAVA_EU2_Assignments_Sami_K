package assignments.Assignment09;

import java.util.Scanner;

public class Question01_calculateTip {

	public static void main(String[] args) {
		/*
		 * Create a method called tipCalculator which accepts parameters:  
		 - boolean isSplit, 
		 - int numberPeople,
		 - double checkAmount,
		 - String serviceQuality
		 
		 * Ask the user to enter each value. 
		 * User should select service quality that will correspond to tip percent.

			Poor 		=  5%
			Fair 		= 10%
			Good 		= 15%
			Great 		= 20%
			Excellent 	= 25%

		* The program should display the following information based on the user input:
			- Split or No split
			- Number of people entered: &&&&
			- Service Quality:
			- Total to pay:
			- Total tip:
			- Total per person:
			- Tip per person:

			Input:
				Split				: Yes
				Number of people	: 4
				Check amount		: 476.0
				Service Quality		: Excellent

			Output:
				Number of people entered	: &&&&
				Total to pay				: 595.00
				Total tip					: 119.00
				Total per person			: 148.75
				Tip per person				:  29.75
		 */

		Scanner input = new Scanner (System.in);
			System.out.print("Enter the number of people 	: ");
			int numberPeople = input.nextInt();
			
			System.out.print("Enter true for split, false  for not split : ");
			boolean isSplit = input.nextBoolean();
			
			System.out.print("Enter the amount paid 		: ");
			double checkAmount = input.nextDouble();
			
			System.out.print("Enter the service quality 	: ");
			String serviceQuality = input.next();
			
			tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);
	}
	
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		
		double totalTip = 0;
		
		switch (serviceQuality) {
		
			case "Poor": 		
				totalTip =  checkAmount * 0.05;
				break;
		
			case "Fair": 		
				totalTip =  checkAmount * 0.1;
				break;
			
			case "Good": 		
				totalTip =  checkAmount * 0.15;
				break;
			
			case "Great": 		
				totalTip =  checkAmount * 0.2;
				break;
		
			case "Excellent": 		
				totalTip =  checkAmount * 0.25;
				break;
			
			default:
				System.out.println("Wrong selection ");
				break;
		}
			
	System.out.println("Number of people entered: " + numberPeople);
	System.out.println("Total to pay		: " + (checkAmount + totalTip));
	System.out.println("Total tip		: " + totalTip);
	System.out.println("Total per person	: " + (checkAmount + totalTip)/numberPeople);
	System.out.println("Tip per person		: " + totalTip/numberPeople);
		
	}

}
