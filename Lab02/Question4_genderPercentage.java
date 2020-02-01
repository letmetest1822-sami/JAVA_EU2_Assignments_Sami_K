package assignments.Lab02;

import java.util.Scanner;

public class Question4_genderPercentage {

	public static void main(String[] args) {
		/*
		 * Write a program that asks user 
		 * for the number of males and the number of females registered in a class. 
		 * The program should display the percentage of males and females in the class.
		 */
		
		percentageOfGender();

	}public static void percentageOfGender() {
		
		Scanner number = new Scanner(System.in);
			System.out.print("Enter the  number  of males : ");
			double males = number.nextDouble();
		
		
			System.out.print("Enter the number of females : ");
			double females = number.nextDouble();
		
		double wholeClass = males + females;
		
		//System.out.println(wholeClass);
		
		double percentageFemales = (females / wholeClass) * 100;
		
		double percentageMales = (males / wholeClass) * 100;
		
		System.out.println("\nThe percentage of females : " + percentageFemales + "%");
		System.out.println("The percentage  of  males : " + percentageMales + "%");
			
	}
	
	
	}
