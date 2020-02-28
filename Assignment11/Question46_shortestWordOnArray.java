package assignments.Assignment11;

import java.util.Arrays;

public class Question46_shortestWordOnArray {

	public static void main(String[] args) {
		/*
		 * Write a program that will find out the shortest words in the given string str. 
		 * If there are few words that are evenly short, print them all. 
		 * Use the split method in order to split the str string variable and create an array of strings. 
		 * Print array with Arrays.toString() method. Sort array before printing.

Sample Output:
     input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
     output: [cat, old, ray]
		 */
		String input = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		
		shortestWordOnArray(input);
	}
	public static void shortestWordOnArray(String word) {
		
		String[] arr = word.split(", "); 
		
		String shortest = arr[0];
		
		for (int i = 1; i<arr.length;i++) {
			if (arr[i].length() < shortest.length()) {
				shortest = arr [i];
			}
		}
		String shortest1 = shortest;
		shortest = "";
		
		for (int i = 0;    i<arr.length;   i++) {
			
			if (shortest1.length() == arr [i].length() ) {
			
			shortest +=  arr [i] + " ";
			}
		}
		String[] arrShortest = shortest.split(" ");
		Arrays.sort(arrShortest);
		System.out.println(Arrays.toString(arrShortest));
	}
}
