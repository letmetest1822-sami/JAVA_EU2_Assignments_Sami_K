package assignments.Assignment09;

import java.util.Scanner;

public class Question05_mergeWords {

	public static void main(String[] args) {
		/*
		 * You have 2 words, both of them have 3 characters. 
		 * If either of them does not have exactly 3 characters, print "cannot merge" 
		 * Merge their characters one by one and print together like below:

			Sample Output:
     			aok
     			lol
     				alookl
     			ear
     			pie
    				epaire
    			java
    			wow
    				cannot merge
		 */
		
		Scanner input = new Scanner (System.in);
		
			System.out.print("Enter the first word : ");
			String word1 = input.next();
			
			System.out.print("Enter the first word : ");
			String word2 = input.next();
		
		mergeWords(word1, word2);
	}

	public static void mergeWords(String word1, String word2) {
		
		int l1 = word1.length();
		int l2 = word2.length();
		
		String merged = "";
		
		if ((l1 == 3) && (l2 == 3)){
			
			for (int i =0; i<3; i++){
				merged = merged + word1.charAt(i) + word2.charAt(i);
			}
			System.out.println(merged);
		}
		else {
			System.out.println("cannot merge");	
		}
	}
}
