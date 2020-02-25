package assignments.Assignment10;

public class Question19_timesJava {

	public static void main(String[] args) {
		/*Return the number of times that the string "java" appears anywhere in the given string word.

		Sample Output:

     input		: javaxjava
     output		: 2

     input		: javaxjavaapplepearjavaegg
     output		: 3
     
     */

		String input1 = "Javaxjava";
		String input2 = "javaxJavaapplepearjavaegg";
		
		timesJava(input1);
		timesJava(input2);
	}

	public static void timesJava(String word) {
		
		int countJava = 0;
		
		for (int i = 0; i <word.length(); i++) {
			
			if (((word.charAt(i) == 'j') || (word.charAt(i) == 'J') ) && (word.substring(i, i+4).equalsIgnoreCase("java"))) {
				
				countJava++;
			}
		}
		System.out.println(countJava);
	}
}
