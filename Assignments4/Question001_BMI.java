package assignments.Assignments4;

public class Question001_BMI {

	public static void main(String[] args) {
		/*  BMI = mass / (height * height)
		 * In this formula, mass is in kilograms and height is in meters. The health risk associated with a BMI value is
		 	- Underweight<18.5
			- Normal Weight>=18.5 and <25
 			- Overweight>=25 and <30
 			- Obese>=30 */
		
		int  massPound=140, heightFeet = 5 , heightInch=1; // Inputs are weight in pounds and height in feets and inches
		
		double BMI, massKg = massPound / 2.2;
		double heightMeter = (heightFeet * 12 * 0.0254) + (heightInch *  0.0254);
			
		System.out.println("Your Height : " + heightMeter + " m and your weight : " + massKg + " Kgs.");
		//Just in case to check if the conversion is OK more or less...
		
		BMI = massKg / (heightMeter * heightMeter); //In this formula, mass is in kilograms and height is in meters.
		
		
		if (BMI < 18.5 ) { 
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " +heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factory is \"Underweight\"");
			
		}else if ((BMI >= 18.5) && (BMI < 25) ) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " +heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factory is \"Normal Weight\"");

		}else if((BMI >= 25) && (BMI < 30) ) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " +heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factory is \"Overweight\"");
			
		}else if( BMI > 30) {
			System.out.println("Your weight in pounds: " + massPound);
			System.out.println("Your height in feet followed by a space then additional inches: " + heightFeet + " " +heightInch);
			System.out.println("Your BMI is " + BMI);
			System.out.println("Your risk factory is \"Obese\"");
		}

}
}
