package assignments.Lab02;

import java.util.Scanner;

public class Question5_taxAndTip {

	public static void main(String[] args) {
		/*
		 * Write a program that computes the tax and tip on a restaurant bill. 
		 * The program should ask the user to enter the charge for the meal. 
		 * The tax should be 6.75 percent of the meal charge. 
		 * The tip should be 20 percent of the total after adding tax. 
		 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */

		taxAndTip();
		
	}
public static void taxAndTip() {
		
		Scanner number = new Scanner(System.in);
		
			System.out.print("Enter the charge of the meal : ");
			
			double mealCharge = number.nextDouble();
			
			double taxAmount = mealCharge * 0.0675;
					
			
			double tipAmount = (mealCharge + taxAmount ) * 0.20;
			
			double totalBill = mealCharge + taxAmount + tipAmount;
			
			System.out.println("\nThe meal charge is : " + mealCharge + " $"); 
			System.out.println("The  tax amount is : " + taxAmount + " $");
			System.out.println("The  tip amount is : " + tipAmount + " $");
			System.out.println("The  total bill is : " + totalBill + " $");
	}
}
