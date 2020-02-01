package assignments.Lab02;

import java.util.Scanner;

public class Question3_sum {

	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for a positive nonzero integer value. 
		 * The program should use a loop to get the sum of 
		 * all the integers from 1 up to the number entered. 
		 */

		sum();
	}

	public static void sum() {
		int sum = 0;
		
		Scanner number = new Scanner (System.in);
			System.out.print("Please enter a positive nonzero integer value : ");
			int num1 = number.nextInt();
				
			for  (int i=1; i<=num1 ; i++) {
			
				sum += i;
			}
		System.out.println("The sum of the numbers from 1 to " + num1 + " is  : " + sum);
		}
	
	}

