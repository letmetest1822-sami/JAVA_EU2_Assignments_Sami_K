package assignments.Assignment09;

import java.util.Scanner;

public class Question13_startEnd_withloop {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out route instructions. 
		 * Your program should take 2 parameters: start point and endpoint. 
		 * Use left, right, up and down for navigation. Insert ">" between commands. 
		 * If start point equals to endpoint - display: "start/end(start or end variable!) found".

		Note: you may move only clockwise.
		
		Sample Output:

     Input : A
     Input : D
     
     Output: right > down > left: D found

     Input  : C
     Input  : C
     Output : C found
     
		 */
		
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for starting point 1 = A, 2 = B, 3 = C, 4 = D : ");
		int startingPoint = input.nextInt();
		
		System.out.print("Enter a number for  ending point  1 = A, 2 = B, 3 = C, 4 = D : ");
		int endingPoint = input.nextInt();
	
		routeInstructions(startingPoint, endingPoint);
	}

	public static void routeInstructions(int start, int end) {
		
		String [] corners = {"A", "B", "C", "D"};
		
		String [] steps = {"right", "down", "left", "up"};
		
		System.out.print( corners[start-1] + " ");
		
			for (int i = start; i<end;i++) {  
			
				System.out.print(" > " + steps[i-1] + " ");
			}
		
		System.out.print( " > " + corners[end-1] + " " + " found.");
	
	}
}
