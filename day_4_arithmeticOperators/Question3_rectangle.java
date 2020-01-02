package assignments.day_4_arithmeticOperators;

public class Question3_rectangle {

	
	public static void main(String[] args) {
		/*Write a Java program that displays the area of a 
		 * rectangle with a width of 4.5 and a height of 7.9 
		 * using the following formula:
		 * area = width * height 
		 */
		
		double area, width = 4.5, height = 7.9;

		area = width * height;

		System.out.println("\nThe area of the rectangle with a width of " 
				+ width + " and height of "+ height +" is : " + (float)area + " \n");
		
		
		
		
		
		System.out.println("   " + width);
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("| "+(float)area+" |  " + height);
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("+-------+");
		
		

	}

}
