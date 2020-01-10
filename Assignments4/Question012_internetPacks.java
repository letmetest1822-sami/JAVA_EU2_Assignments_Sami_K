package assignments.Assignments4;

public class Question012_internetPacks {

	public static void main(String[] args) {
		/* An internet service provider has three different subscription packages for its customers:

Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour
Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour
Package C: For $19.95 per month unlimited access is provided

* Write a program that calculates a customer's monthly bill. 
* It should let the user declare the letter of the package the customer has 
purchased (A, B, or C) and the number of hours that were used. 
* It should then display the total charges. */
		
		//char pack = 'A'; 
		char pack = 'B'; 
		//char pack = 'C'; 
		
		double hours10perMonth = 9.95;
		double hours20perMonth = 13.95;
		double hoursUnlimitedPerMonth = 19.95;
		double monthlyBill=1, additionalHours=10;
		
		switch (pack) {
		
			case 'A':
				monthlyBill = hours20perMonth + (additionalHours * 2);
				System.out.println("Monthly bill is :" + monthlyBill);
				break;
		
			case 'B':
				monthlyBill = hours10perMonth + (additionalHours * 1);
				System.out.println("Monthly bill is :" + monthlyBill);
				break;
		
			case 'C':
				monthlyBill = hoursUnlimitedPerMonth;
				System.out.println("Monthly bill is :" + monthlyBill);
				break;
		}
	}

}
