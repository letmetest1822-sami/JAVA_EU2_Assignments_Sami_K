package assignments.Assignment11;

import java.util.Scanner;

public class Question48_calculateBinaryValue2 {

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

		
		Scanner input = new Scanner( System.in );

        System.out.println("Enter Integer: ");
        String integerString =input.nextLine();
        
		calculateBinaryValue(integerString);
	}
	public static void calculateBinaryValue(String a) {
        

        System.out.println("Binary Number: "+Integer.toBinaryString(Integer.parseInt(a)));
		}
	}

