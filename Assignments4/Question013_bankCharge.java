package assignments.Assignments4;

public class Question013_bankCharge {

	public static void main(String[] args) {
/* A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:

                $.10 each for less than 20 checks
                $.08 each for 20-39 checks  
                $.06 each for 40-59 checks
                $.04 each for 60 or more checks

* Write a program that lets the user declare the number of checks written for the month.
* The program should then calculate and display the bank's service fees for the month. */
		
		int numberOfChecks = 60; 
		double  baseFee = 10;
		double totalCharge;
		
		if (numberOfChecks < 20) {
			
			totalCharge = baseFee + (numberOfChecks * 0.1);
			System.out.println("Total charge is " + totalCharge + "$ per month for " + numberOfChecks + " checks.");
			
		}else if ((numberOfChecks >= 20) && (numberOfChecks < 40)) {
			
			totalCharge = baseFee + (numberOfChecks * 0.08);
			System.out.println("Total charge is " + totalCharge + "$ per month for " + numberOfChecks + " checks.");
			
		}else if ((numberOfChecks >= 40) && (numberOfChecks < 60)) {
			
			totalCharge = baseFee + (numberOfChecks * 0.06);
			System.out.println("Total charge is " + totalCharge + "$ per month for " + numberOfChecks + " checks.");
			
		}else if (numberOfChecks >= 60) {
			
			totalCharge = baseFee + (numberOfChecks * 0.04);
			System.out.println("Total charge is " + totalCharge + "$ per month for " + numberOfChecks + " checks.");
			
		}
	}

}
