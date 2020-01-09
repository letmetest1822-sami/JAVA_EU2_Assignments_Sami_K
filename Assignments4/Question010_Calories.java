package assignments.Assignments4;

public class Question010_Calories {

	public static void main(String[] args) {
		/* Write a program that lets the user declare a number of calories and fat grams in a food item.
		 * The program should display the percentage of calories that come from fat. 
		 * One gram of fat has 9 calories; therefore:

                Calories from fat = Fat grams * 9

		* The percentage of calories from fat can be calculated as follows:

                Calories from fat/Total Calories

		* If the calories from fat are less than 30 percent of the total calories of the food, 
		* it should also display a message indicating the food is low in fat.

 		Note: The number of calories from fat can not be greater than 
 			  the total number of calories in the food item. 
 		      If the program determines that the number of calories from fat is 
 		      greater than the number of calories in the food item, 
 		      it should display an error message indicating that the input is invalid.*/

		double CaloriesFromFat, numberOfCalories=300, fatGramsInFood = 5;
		double percentageOfCaloriesFromFat;
		
		CaloriesFromFat = fatGramsInFood * 9;
		//System.out.println("CaloriesFromFat  :" + CaloriesFromFat);
		//System.out.println("NumberOfCalories :" + numberOfCalories);
		
		percentageOfCaloriesFromFat = CaloriesFromFat / numberOfCalories;
		
		
		
		if (numberOfCalories < CaloriesFromFat) { 
			System.out.println("The input is invalid.");
			
		}else {
			System.out.println("The percentage of calories that come from fat : %" + percentageOfCaloriesFromFat*100 );
			
			if (CaloriesFromFat < (numberOfCalories*0.3)) {
				
				System.out.println("This food is low in fat");
		
		}
	}

}
}
