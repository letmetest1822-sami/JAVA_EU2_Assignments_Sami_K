package assignments.Assignment09;

import java.util.Scanner;

public class Question13_startEnd {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out route instructions. 
		 * Your program should take 2 parameters: start point and endpoint. 
		 * Use left, right, up and down for navigation. Insert ">" between commands. 
		 * If start point equals to endpoint - display: "start/end(start or end variable!) found".

		Note: you may move only clockwise.

		Sample Output:

     Input: A
     Input: D
     
     Output: right > down > left: D found

     Input: C
     Input: C
     Output: C found
		 */
		
	Scanner input = new Scanner(System.in);
		System.out.print("Enter starting point : ");
		String startingPoint = input.next();
		
		System.out.print("Enter  ending  point : ");
		String endingPoint = input.next();
	
		routeInstructions(startingPoint, endingPoint);

	}

	public static void routeInstructions(String start, String end) {
									
		if (start.equalsIgnoreCase(end)) {
			System.out.print(start + " found");
		}
		else if ((start.equalsIgnoreCase("a"))  && (end.equalsIgnoreCase("b"))){
			System.out.print("right  : B found");
		}		
		else if ((start.equalsIgnoreCase("a"))  && (end.equalsIgnoreCase("c"))){
			System.out.print("right > down : C found");
		}
		else if ((start.equalsIgnoreCase("a"))  && (end.equalsIgnoreCase("d"))){
			System.out.print("right > down > left: D found");
		}
		else if ((start.equalsIgnoreCase("b"))  && (end.equalsIgnoreCase("c"))){
			System.out.print("down : C found");
		}
		else if ((start.equalsIgnoreCase("b"))  && (end.equalsIgnoreCase("d"))){
			System.out.print("down > left: D found");
		}
		else if ((start.equalsIgnoreCase("c"))  && (end.equalsIgnoreCase("d"))){
			System.out.print("left: D found");
		}
	}
}
