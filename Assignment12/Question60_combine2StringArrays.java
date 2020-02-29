package assignments.Assignment12;

import java.util.ArrayList;

public class Question60_combine2StringArrays {

	public static void main(String[] args) {
		/*
		 * combine two String arrays into one arraylist and return it as a string.

Sample Output:

     combineRs(["f","o","o"],[" b","a","r"])
     returns "foo bar"


     combineRs(["1","2","3"],[" 4"])
     returns "1234"
		 */

		String [] input1 = {"f","o","o"};
		String [] input2 = {" b","a","r"};
		
		String [] input3 = {"1","2","3"};
		String [] input4 = {" 4"};
		
		System.out.println(combine2StringArrays(input1, input2));
		System.out.println(combine2StringArrays(input3, input4));
		
	}
	public static String combine2StringArrays(String []arr1, String []arr2) {
		
		ArrayList<String> combined = new ArrayList<>();
		
			for(int i = 0; i<arr1.length; i++) {
				combined.add(arr1[i]);
			}
			for(int i = 0; i<arr2.length; i++) {
				combined.add(arr2[i]);
			}
	return String.join("",combined);
	}
}
