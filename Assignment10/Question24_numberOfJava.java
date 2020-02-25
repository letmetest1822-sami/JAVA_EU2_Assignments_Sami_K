package assignments.Assignment10;

public class Question24_numberOfJava {

	public static void main(String[] args) {
		/*
		 * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false
		 */

		String input1 = "We study java not python";
		String input2 = "What's the difference between java, javascript and python?";
		
		
		numberOfJava(input1);
		numberOfJava(input2);
		
	}

	public static void numberOfJava(String word) {
		
		//String word1 = word.replace("java", "");
		//System.out.println(word1);
		System.out.println(word.contains("java"));
		int n1 = word.indexOf("java");
		System.out.println(n1);
	}

}
