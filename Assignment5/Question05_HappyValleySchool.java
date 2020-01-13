package assignments.Assignment5;

import java.util.Scanner;

public class Question05_HappyValleySchool {

	public static void main(String[] args) {
		/* In the Happy Valley School System, children are classified by age as follows:

	less than 2, 		ineligible
			2,			toddler
			3-5, 		early childhood
			6-7, 		young reader
			8-10, 		elementary
		11 and 12, 		middle
			13, 		impossible
			14-16, 		high school
			17-18, 		scholar
	greater than 18, 	ineligible

		* Given an int variable age, write an if statement that prints out, 
		* on a line by itself, the appropriate label from the above list based on age.
		
		Sample Output
		Age : 8
		Elementary                */

		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your age : ");
		int age = input.nextInt();
		input.close();
		
		//int age = 1;
		
		if ((age <2) || (age>18)) {
			System.out.println("Age  : " + age + "\nIneligible");
			
		}else if (age == 2) {
			System.out.println("Age  : " + age + "\nToddler");
			
		}else if ((age >= 3) && (age < 6)) {
			System.out.println("Age  : " + age + "\nEarly Childhood");
			
		}else if ((age == 6) || (age == 7)) {
			System.out.println("Age  : " + age + "\nYoung Reader");
			
		}else if ((age >= 8) && (age <= 10)) {
			System.out.println("Age  : " + age + "\nElementary");
			
		}else if ((age == 11) || (age == 12)) {
			System.out.println("Age  : " + age + "\nMiddle");
			
		}else if (age == 13) {
			System.out.println("Age  : " + age + "\nImpossible");
			
		}else if ((age >= 14) && (age <= 16)) {
			System.out.println("Age  : " + age + "\nHigh School");
			
		}else if ((age == 17) || (age == 18)) {
			System.out.println("Age  : " + age + "\nScholar");
			
		}
	}

}
