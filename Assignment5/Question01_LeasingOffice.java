package assignments.Assignment5;

public class Question01_LeasingOffice {

	public static void main(String[] args) {
		/* In this assignment, you will write a program for the Leasing office.

Declare and assign value for numberOfBedrooms variable
Declare startingPrice variable and set the price to 0.

Using Multi-Way If statement, create this program logic:

numberOfBedrooms is 1
print "One Bedroom Selected"
set startingPrice as 1100

numberOfBedrooms is 2
print "Two Bedroom Selected"
set startingPrice as 1850

numberOfBedrooms is 3
print "Three Bedroom Selected"
set startingPrice as 2550

All other inputs:
print "No such Bedrooms available"

Print "Starting Price: value" */

		
		int numberOfBedrooms = 2, startingPrice =0; 
		
		if (numberOfBedrooms == 1) {
			System.out.println("One Bedroom Selected" );
			startingPrice = 1100;
			System.out.println("Starting Price : " + startingPrice);
		
		}else if (numberOfBedrooms == 2) {
			System.out.println("Two Bedrooms Selected" );
			startingPrice = 1850;
			System.out.println("Starting Price : " + startingPrice);
		
		}else if (numberOfBedrooms == 3) {
			System.out.println("Three Bedrooms Selected" );
			startingPrice = 2550;
			System.out.println("Starting Price : " + startingPrice);
		}else {
			System.out.println("No such Bedrooms available");
		}
		
	}

}
