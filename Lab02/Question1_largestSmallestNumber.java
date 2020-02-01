package assignments.Lab02;

import java.util.Scanner;

public class Question1_largestSmallestNumber {

	public static void main(String[] args) {
		/*
		 * Write a program with a loop that lets the user enter a series of integer numbers. 
		 * After all the numbers have been entered, 
		 * the program should display the largest and smallest numbers entered.
		 */

		
		largestAndSmallest();
	}

	public static void largestAndSmallest() {
		int max=0, min=0;
		byte YesNo = 1;
		
		
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Enter your first number : ");
				int num1 = sc.nextInt();
				
			System.out.print("Enter your next number : ");
				int num2 = sc.nextInt();
					
					
					while (YesNo == 1) {
						
						System.out.print("Do you want to enter an other number: 0-No, 1-Yes ");
						byte b1 = sc.nextByte();

						if(b1==0) {
							YesNo = 0;
							
						}else if(b1==1 ) {
							System.out.print("Enter your next number : ");
							int num3 = sc.nextInt();
					
						
						}else {System.out.print("Please enter 0 or 1 : ");
						}			
								
						if (num1>=num2) {
							max = num1;
							min = num2;
								}else if(num1<max){
									max = num2;
									min = num1;
								}
					
					}
			
		System.out.println("Smallest number is : " + min);
		System.out.println("Largest number is : " + max);
		}
	}
