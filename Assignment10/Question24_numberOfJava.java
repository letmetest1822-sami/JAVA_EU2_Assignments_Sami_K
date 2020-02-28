package assignments.Assignment10;

public class Question24_numberOfJava {

	public static void main(String[] args) {
		/*
		 * Given a string, print out true if the number of appearances of "java" 
		 * anywhere in the string is equal to the number of appearances of "python" 
		 * anywhere in the string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false
		 */

		String input1 = "We study java not python";
		String input2 = "What's the difference between java, javascript and python?";
				
		pythonJavaEqual(numberOfPython(input1),numberOfJava(input1),input1);
		pythonJavaEqual(numberOfPython(input2),numberOfJava(input2),input2);
		
	}
	public static void pythonJavaEqual(int a, int b, String word) {
		
		if (numberOfPython(word)==numberOfJava(word)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static int numberOfJava(String word) {
		int countJava = 0;
		String wordJava = word;
		
		while (wordJava.contains("java")) {
			wordJava = wordJava.substring(wordJava.indexOf("java")+4);
			countJava++;	
		}
		return countJava;
}
	
	public static int numberOfPython(String word) {
	
		int countPython = 0;
		String wordPython = word;
	
		while (wordPython.contains("python")) {
			wordPython = wordPython.substring(wordPython.indexOf("python")+6);
			countPython++;	
		}
		return countPython;	
	}
}
