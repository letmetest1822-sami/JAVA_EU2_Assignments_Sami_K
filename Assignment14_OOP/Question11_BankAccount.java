package assignments.Assignment14_OOP;

import java.util.Scanner;

public class Question11_BankAccount {

/*
 * Assume the existence of a BankAccount class.
 * Define a subclass, 
 * SavingsAccount that contains the following: 
	-	A double instance variable, interestRate.
 * A method getInterestRate that returns a value of interestRate.
 * A constructor that accepts a parameter of type double which is used to initialize the instance variable.
 */


	static class SavingsAccount extends Question11_BankAccount{
	//instance variable
	private double interestRate;
	
	//method
	public double getInterestRate() {
		return interestRate;
	}
	
		public SavingsAccount(double interestRate) {
			this.interestRate = interestRate;
		}
	
	}

	// Main method to run the code
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter you Balance : ");
		double balance = input.nextDouble();
		
		
		SavingsAccount BA = new SavingsAccount(0.1);
		
		Double interestIncome = balance*(BA.getInterestRate());
		
		System.out.println("Your new balance is = " + (balance + interestIncome) + "$" ); 
	}

}

