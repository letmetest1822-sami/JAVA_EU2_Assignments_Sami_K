package assignments.Lab02;

import java.util.Scanner;

public class Question2_calculateCalories {

	public static void main(String[] args) {
		/*
		 * A bag of cookies holds 40 cookies. 
		 * The calorie information on the bag claims that there are 10 serving in the bag 
		 * and that a serving equals 300 calories. 
		 * write a program that lets the user enter the number of cookies he or she actually ate 
		 * and then reports the number of total calories consumed.
		 */
		
		caloriesConsumed();
	}
	public static void caloriesConsumed() {
		int cookiesPerBag = 40;			// 40 cookies in every bag
		int servingPerBag = 10;			// 10 servings in every bag
		int cookiesPerServing = 4;		//  4 cookies in every serving
		int caloriesPerServing = 300; 	//300 calories in every serving
		
			int caloriesPercookie = caloriesPerServing/cookiesPerServing;
		
		Scanner number = new Scanner (System.in);
			System.out.println("Please enter the number of cookies you have eaten : ");
			int numberOfCookiesEaten = number.nextInt();
		
		int totalCalories = numberOfCookiesEaten * caloriesPercookie;
		
		System.out.println("You consumed " + totalCalories + " calories by eating " + numberOfCookiesEaten + " cookies.");
	
	}

}
