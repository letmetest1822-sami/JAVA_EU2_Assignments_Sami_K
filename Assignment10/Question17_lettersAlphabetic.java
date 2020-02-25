package assignments.Assignment10;

public class Question17_lettersAlphabetic {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out letters in the alphabetic order
		 *  accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO
		 */
		char input1 = 'a';
	    char input2 = 'f';
	    
	    char input3 = 'B';
	    char input4 = 'O';
	    
	    lettersAlphabetic(input1, input2);
	    lettersAlphabetic(input3, input4);
	}

	public static  void lettersAlphabetic(char letter1, char letter2) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		//We can also use first half of the str (CAPITAL part) and check with isUpperCase or isLowerCase
		
		int n1 = str.indexOf(letter1);
		int n2 = str.indexOf(letter2+1);
		
		String result = str.substring(n1, n2);
		
		System.out.println(result);
		}
	}



