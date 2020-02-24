package assignments.Assignment09;

import java.util.Arrays;

public class Question09_swapNameSurname {

	public static void main(String[] args) {
		/*
		 * In this task, you need to swap the first name with the last name in the email. 
		 * If the email doesn't contain underscore - do not DO anything.

	Sample Output:
     	input	: mike_tyson@gmail.com
     	output	: tyson_mike@gmail.com

     	input	: barakobama@gmail.com
     	output	: barakobama@gmail.com
		 */

		String input1	= "mike_tyson@gmail.com";
     	String input2	= "barakobama@gmail.com";
     	
     	swapNameSurname(input1);
     	swapNameSurname(input2);     	
	}
	public static void swapNameSurname(String word) {
		
		String swapped = "";
		
		int n = word.indexOf('@');
		
		boolean flag = false;	
		
		for (int i = 0; i<word.length(); i++) {
			
			if (word.charAt(i) == '_') {
				
				swapped += word.substring(i+1, n) +"_" + word.substring(0, i) + word.substring(n);
				
				System.out.println(swapped);
				
				flag = true;
				
				break;
			}
		}
		if (flag == false){
			
			System.out.println(word);
		}
		
	}

}
