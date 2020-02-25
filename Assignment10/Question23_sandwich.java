package assignments.Assignment10;

public class Question23_sandwich {

	public static void main(String[] args) {
		/*
		 * A sandwich is two pieces of bread with something in between. 
		 * Print the string that is between the first and last appearance of "bread" in the given string, 
		 * or return string "nothing" if there are not two pieces of bread.

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter
		 */

		String input1 = "breadjambread";
		String input2 = "xxbreadjambreadyy";
		String input3 = "xxbreadapple";
		String input4 = "breadbutterbread";
		
		//sandvich(input1);
		sandvich(input2);
		//sandvich(input3);
		//sandvich(input4);
	}

	public static void sandvich(String word) {
		
		String word1 = word.replace("bread", "");
		//System.out.println(word1);
		//System.out.println(word1.contains("bread"));
		int n1 = word.indexOf("bread");
		System.out.println((word.substring(n1+5, n1+8)));
		//System.out.println(word.replace((word.substring(0, n1)), "").replace("bread", ""));
	}
}
