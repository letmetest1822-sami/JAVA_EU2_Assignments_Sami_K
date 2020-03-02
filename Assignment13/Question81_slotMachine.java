package assignments.Assignment13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question81_slotMachine {

	public static void main(String[] args) {
		/*
		 * A slot machine (Links to an external site.) is a gambling device that 
	the user inserts money into and then pulls a lever (or presses a button). 
		 * The slot machine then displays a set of random images. 
		 * If two or more of the images match, the user wins an amount of money 
	that the slot machine dispenses back to the user.
		 * Create a program that simulates a slot machine. When the program runs, it should do the following:
		 
		 * Ask the user to enter the amount of money he or she wants to enter into the slot machine.
		 * Instead of displaying images, the program will randomly select a word from the following list: 
		 * Cherries, Oranges, Plums, Bells, Melons, Bars
		 * To select a word, the program can generate a random number in the range of 0 through 5. 
		 * If the number is 0, the selected word is Cherries; 
		 * if the number is 1, the selected word is Oranges; and so forth. 
		 * The program should randomly select a word from the list three times and display all three of the words.
		 * If none of the randomly selected words match, the program will inform the user that he or she has won $0.
		 * If two of the words match, the program will inform the user that he or she was won two times the amount entered.
		 * If three of the words match, the program will inform the user that he or she has won three times the amount entered.
		 * The program will ask whether the user wants to play again. 
		 * If so, these steps are repeated. 
		 * If not, the program displays the total amount of money entered into the slot machine and the total amount won.

 
		 */

		
		Scanner input = new Scanner (System.in);
		System.out.println("*---------------------------------------------*");
		System.out.print("| Enter the amount of money you want to play : ");
			int amountToPlay = input.nextInt();
			
			String repeat = "Y";
			
			String [] startGame = new String[3];
			
			int moneyAtTurn = 0;
			int moneyEarned = 0;
			int moneySpent = 0;
			
			moneySpent = moneySpent + amountToPlay;
		
			startGame = gameScreen();
			moneyAtTurn = accounting(amountToPlay, startGame);					
			System.out.println("| You won			: " + moneyAtTurn + "	|");
			
			moneyEarned += moneyAtTurn;				
			
			System.out.println("| Total amount played		: " + moneySpent + "	|");
			System.out.println("| Total Earnings		: " + moneyEarned+ "	|");
			System.out.println("*---------------------------------------*");
		
			
		System.out.println("| Do you want to play again y = yes ?	|"); 
		System.out.println("*---------------------------------------*");		
		repeat = input.nextLine();
	}

	public static String[] gameScreen() {
		
		Random rn = new Random();
		String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
		String[] images = new String[3];
		
		for (int i=0;      i<3;     i++) {
			int showImage = rn.nextInt(5)+1;
			images[i] = words[showImage];
		}
		System.out.println("*----------------------------------------*");
		System.out.println("|                                       |");
		System.out.println("|       " +Arrays.toString(images) + "		|");	
		System.out.println("|                                       |");
		System.out.println("*----------------------------------------*");
		return images;
		
}
	public static int accounting(int money, String[] gameScreen) {
		
		int moneyEarned = money;
		
		if (gameScreen[0] == gameScreen[1] && gameScreen[0]==gameScreen[2]) {
			moneyEarned *= 3;
		}else if(gameScreen[0] == gameScreen[1] || gameScreen[0] == gameScreen[2] || gameScreen[1] == gameScreen[2]) {
			moneyEarned *= 2;
		}else {
			moneyEarned *= 0;
		}
		
		return moneyEarned;
}
}
