package assignments.Lab03;

import java.util.Scanner;

public class Question02_HiBye {

	public static void main(String[] args) {
		/*
		 * Create a method that accepts two strings, a and b, 
		 * return the result of putting them together in the order abba, e.g. 
		 * "Hi" and "Bye" returns "HiByeByeHi".
		 * makeAbba("Hi", "Bye") → "HiByeByeHi"
		 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
		 * makeAbba("What", "Up") → "WhatUpUpWhat"
		 */

		makeAbba();
	}

	public static void makeAbba() {
		Scanner name = new Scanner (System.in);
		System.out.print("Enter a word : ");
		String word1 = name.nextLine();
		
		System.out.print("Enter another word : ");
		String word2 = name.nextLine();
						
	System.out.println(word1 + word2 + word2+ word1);
	}
}
