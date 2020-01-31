package assignments.Assignment8_Methods;

public class Question04_printHollowRect {

	public static void main(String[] args) {
		/*
		 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
		 * hint: you will need to use two nested for loops for that, 
		 * and an if that checks if its the last or first iteration of the loop 
		 * (so you will know what to print "*" or " ")
		 */

		
		printHollowRect();
		
	}
	public static void printHollowRect() {
		
		for (int i = 1;     i<=5;   i++) {	// for loop with i will create rows
			
			for (int j =1;  j<=5;   j++) {	// for loop with j will print * and spaces
				
				if ((i==1)||(i==5)) {	// while in the first and last iteration of the i loop just print *
					
					System.out.print("*");
					
				}else if ((j ==1) ||(j ==5)) { 	// when we are in the first and last iteration of the j loop just print *
					
					System.out.print("*");
					
				}else{
					
					System.out.print(" ");	// when we are in the first and last  j loop just print *
				}
				
			}
			
			System.out.println();
		}
	}

}
