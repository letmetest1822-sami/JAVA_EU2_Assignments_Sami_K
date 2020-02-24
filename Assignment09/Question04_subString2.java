package assignments.Assignment09;

import java.util.Scanner;

public class Question04_subString2 {

	public static void main(String[] args) {
		/*
		 * You have a word, do the following:

	If the word has odd number of characters and has 5 or more characters, 
	print the middle three characters of the word. 
	Otherwise, print "invalid".

	Sample Output:

       fifteen 	==> fte
       apple	==> ppl
       hey 		==> invalid
       java 	==> invalid
       whatsup 	==> ats
       $ 		==> invalid
		 */
		subString2();
	}
	
	public static void subString2() {
	
		Scanner input = new Scanner (System.in);
			System.out.print("Enter a word : ");
			String word = input.next();
	
		int len = word.length();

		if ((len % 2 != 0) && (len>=5)) { 
			
				System.out.println(word.substring((((len-1)/2)-1), ((len-1)/2)+2));
			}
			else   {
				System.out.println("invalid");
			}
		}
	}

