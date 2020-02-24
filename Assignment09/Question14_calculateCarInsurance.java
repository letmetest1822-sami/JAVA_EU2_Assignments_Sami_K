package assignments.Assignment09;

import java.util.Scanner;

public class Question14_calculateCarInsurance {

	public static void main(String[] args) {
		/*
		 * Write a program that will calculate car insurance premium.
Steps to write a program:
First things first, your program should ask the customer to provide a name, 
so display a message: "Enter your name".

Then ask the user about ownership of the US driver's license. 
Display message: "Do you have a US driver license?". 
If the user doesn't have a US driver's license - 


display warning message: "Invalid data!" and stop the program 
(use System.exit(0) after displaying warning message to stop the program).

Then ask the user to provide a zip code. 
If zip code equals to 20910 or 20740, add $60 to the premium (an amount to be paid for an insurance policy).
If zip code equals to 22102 or 22103, add $30 to the premium. 
Otherwise, add $50 to the premium.

Then ask the user about car ownership. 
Display message: "Is this vehicle Owned, Financed, or Leased?". 
If the car is owned, add $10 to the premium, otherwise, add $20 to the premium.

Then ask the user about car usage. Display message: "How is this vehicle primarily used?". 
If the car used for Business, add $50 to the premium. 
If the car is for pleasure add $10 to the premium. 
If the car is for Commute - add $20 to the premium.

Then ask the user how many days per week user drives to work. 
Display message: "Days Driven To Work And/Or School". 
Add $5 to the premium for every day driven to work.

Then, ask the user about how many miles customers drive to work or school. 
Display message: "Miles Driven To Work And/Or School". 
Increase premium per $1 for every 1 mile.

Then ask the customer about his age. 
Display message: "How old are you?".
     If age is less than 16, display the message: "Invalid data!", and stop the program.
     If age is between 16 and 18 (exclusive), multiply premium by 20.
     If age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6.
     If age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
     

Then, ask the customer about the driving experience. 
Make sure that experience is greater than 0 and 
the result of subtraction age from experience is greater or equals to 16. 
If no, display the message: "Invalid data!" and stop the program. 
Reduce premium on $5 for every year of experience.

Then, ask the customer about car accidents. 
Display message: "Have you had any accidents in the last 5 years?". 
If the answer equals "Yes" or "YES", ask customer about amount of accidents. 
Display message: "How many?", in order to get information about the amount of accidents. 
Add 20% to the premium price for every accident.

Then, ask the customer if he had continuous insurance for the past 12 months. 
Display message: "Have you had continuous insurance for the past 12 months?". 
If the customer provides a negative answer (No) - double the premium.

Then ask the user about the level of education. 
Display message: "What is the highest level of education you have completed?".
     If the level of education equals to "Ph.D." or "Bachelors" or "Masters" - reduce the premium by 5%.
     If the level of education equals "Doctors" reduce the premium by 10%.
     If the level of education equals "Less than High School" increase the premium by 5%.

After all, display the message "customer, here's your quote!". 
Instead of the customer, you need to insert customers' name. 
The display message: "Start Your Policy Today For: $premium". 
Instead of premium, your program should print the premium's variable value. 
Then display the message with reference number: 
"Reference number: referenceNumber". 
In order to build reference number variable (referenceNumber), 
concatenate first 2 letters of customer's name, 
age, 
last 2 letters of customer's name, 
zip code, and 
level of education without spaces. 
This value should be all upper case!



Sample Output:

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: David
Display message: Do you have a US driver license?
input from user: Yes
Display message: Enter your zip code
input from user: 20910
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
Display message: How is this vehicle primarily used?
input from user: Pleasure
Display message: How old are you?
input from user: 25
Display message: How many years you've been driving?
input from user: 5
Display message: Have you had any accidents in the last 5 years?
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
Display message: What is the highest level of education you have completed?
input from user: PhD
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD

Example #2

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: Robin Van Bobbin
Display message: Do you have a US driver license?
input from user: No
Display message: Invalid data!
Example #3

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: Max Payne
Display message: Do you have a US driver license?
input from user: Yes
Display message: Enter your zip code
input from user: 20740
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
Display message: How is this vehicle primarily used?
input from user: Commute
Display message: Days Driven To Work And/Or School
input from user: 5
Display message: Miles Driven To Work And/Or School
input from user: 10
Display message: How old are you?
input from user: 15
Display message: Invalid data!
		 */

		
		calculateCarInsurance();

	}
	public static void calculateCarInsurance() {
	
	System.out.println("Welcome to the CountyFarm car insurance!");
	
	double premium = 0;
	
	Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your name  			: ");
		String name = input.nextLine();
			
		System.out.print("Do you have a US driver license? 	:");
		String license = input.nextLine();
			
			if (license.equalsIgnoreCase("no")) {
				System.out.print("Invalid data!");
				System.exit(0);
			}
				
		System.out.print("Enter the ZIP Code 			:");
		String zipCode = input.nextLine();
		
			if ((zipCode.equals("20910")) || (zipCode.equals("20740"))) {
				premium += 60;
			}
			else if ((zipCode.equals("22102")) || (zipCode.equals("22103"))) {
				premium += 30;
			}
			else {
				premium += 50;
			}
					
		System.out.print("Is this vehicle Owned, Financed, or Leased? : ");
		String ownership = input.nextLine();		
						
			if (ownership.equalsIgnoreCase("owned")) {
				premium += 10;
			}
			else {	
				premium += 20;
			}
				
		System.out.print("How is this vehicle primarily used?  	: ");
		String primaryUse = input.nextLine();		
				
			if (primaryUse.equalsIgnoreCase("business")) {
				premium += 50;
			}
			else if (primaryUse.equalsIgnoreCase("pleasure")) {
				premium += 10;
			}
			else if (primaryUse.equalsIgnoreCase("commute")) {		
				premium += 20;
			}
	
		System.out.print("Days Driven To Work And/Or School? 	: ");
		int daysPerWeek = input.nextInt();	
		
				premium += (daysPerWeek * 5);
		
		System.out.print("Miles Driven To Work And/Or School?	: ");
		int milePerDays = input.nextInt();	
		
				premium += milePerDays;	
			
		System.out.print("How old are you? 			: ");
		int age = input.nextInt();	
				
			if (age<16) {
				System.out.print("Invalid data!");
				System.exit(0);
			}
			else if ((age > 16) && (age < 18)) {
				premium *=  20;
			}
			else if ((age >= 18) && (age <= 21)) {
				premium *= 6;
			}
			else if ((age > 21) && (age < 25)) {
				premium *= 2;
			}
					
		System.out.print("How many years you've been driving? 	: ");
		int experience = input.nextInt();	
						
			if ((experience < 1) && ((age - experience) < 16)){
				System.out.print("Invalid data!");
				System.exit(0);
			}
			else {
				premium -= (experience * 5);
			}
			
		System.out.print("Have you had any accidents in the last 5 years?		:");
		String accidentCheck = input.next();		
			
			if (accidentCheck.equalsIgnoreCase("yes")) {
				System.out.print("How many accidents did you have?	:");
				int countAccidents = input.nextInt();
				
				premium += (countAccidents * 0.20 * premium);
			}
					
		System.out.print("Have you had continuous insurance for the past 12 months?	:");
		String insuranceCheck = input.next();	
		
			if (insuranceCheck.equalsIgnoreCase("no")) {
				premium *= 2;
			}
		
		System.out.print("What is the highest level of education you have completed?	:");
		String educationLevel = input.next();	
			
			if ((educationLevel.equalsIgnoreCase("Ph.D.")) || ( educationLevel.equalsIgnoreCase("Bachelors")) || ( educationLevel.equalsIgnoreCase("Masters")) ) {
				premium -= (premium * 0.05);
			}	
			else if (educationLevel.equalsIgnoreCase("Doctors")) {
				premium -= (premium * 0.1);
			}	
			else if (educationLevel.equalsIgnoreCase("Less than High School")) {
				premium += (premium * 0.05);
			}	
				
			System.out.println(name + " here's your quote!");     

			System.out.println("Start Your Policy Today For: $ " + premium);
			
			String referenceNumber = (name.substring(0, 2) + age + name.substring(name.length()-3, name.length()-1) + zipCode + educationLevel).toUpperCase();
			
			System.out.println("Reference Number  : " + referenceNumber);
	}
}
