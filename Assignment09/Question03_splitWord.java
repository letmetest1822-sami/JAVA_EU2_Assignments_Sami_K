package assignments.Assignment09;

import java.util.Scanner;

public class Question03_splitWord {

	public static void main(String[] args) {
		/*
		 * You have a word, do the following:

	1. When word has odd number of characters and:
     - 3 or more characters, print middle letter
              oak ==> a
              javav ==> v
     - Single character, print that character 3 times
             # ==> ###
             q ==> qqq

	2. When word has even number of characters and:
     - 4 or more characters, print middle 2
            java ==> av
            apples ==> pl
            #$%^&* ==> %^
    - 2 characters, print those 2 characters twice
           @@ ==>@@@@
           $$ ==>$$$$
           hi ==> hihi
		 */

		splitWord();
		
	}

	public static void splitWord() {
		
		Scanner input = new Scanner (System.in);
			System.out.print("Enter a word : ");
			String word = input.next();
			
		int len = word.length();
		
		if (len % 2 != 0) { // length is odd number
			if (len>3) {
				System.out.println(word.substring(((len-1)/2), ((len-1)/2)+1));
			}
			else if (len ==1) {
				System.out.println(word+word+word);
			}
		}
		else if (len % 2 == 0) { // length is odd number
			if (len>=4) {
				System.out.println(word.substring((((len)/2)-1), ((len)/2)+1));
			}
			else if (len ==2) {
				System.out.println(word+word);
			}
		}
	}
}
