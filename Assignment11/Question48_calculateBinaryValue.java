package assignments.Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question48_calculateBinaryValue {

	public static void main(String[] args) {
		/*
		 * Binary number is a number expressed in the base-2 numeral system or binary numeral system, 
		 * which uses only two symbols: typically 0 (zero) and 1 (one). 
		 * Each digit is referred to as a bit.

128	 64	 32	 16	 8	 4	 2	 1
--	 --	 --	 --	 --	 --	 --	--
 0	 0	 0	 0	 0	 1	 1	 1

Given an int variable decimal, write a java program to calculate the binary value of the decimal variable 
and assign it a binary array. print out the value of binary array matching below format. 
Feel free to use additional arrays or formulas.

Sample Output:

     decimal -> 3
     binary -> [0, 0, 0, 0, 0, 0, 1, 1]

     decimal -> 35
     binary -> [0, 0, 1, 0, 0, 0, 1, 1]

     decimal -> 255
     binary -> [1, 1, 1, 1, 1, 1, 1, 1]
		 */

		
		ArrayList<Integer> powers = new ArrayList<Integer>();
	    ArrayList<Integer> binaryStore = new ArrayList<Integer>();

	    powers.add(128);
	    powers.add(64);
	    powers.add(32);
	    powers.add(16);
	    powers.add(8);
	    powers.add(4);
	    powers.add(2);
	    powers.add(1);

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer to convert binary: ");
	    int input = sc.nextInt();
	    int printableInput = input;

	    for (int i : powers) {
	        if (input < i) {
	            binaryStore.add(0);     
	        } else {
	            input = input - i;
	            binaryStore.add(1);             
	        }           
	    }

	    String newString= binaryStore.toString();
	    String finalOutput = newString
	    		.replace("[", "")
	            .replace(" ", "")
	            .replace("]", "")
	            .replace(",", "");

	    System.out.println("Integer value: " + printableInput + "\nBinary value: " + finalOutput);
	    sc.close();
		
		
	}

}
