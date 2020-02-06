package assignments.Lab03;

import java.util.Scanner;

public class Question01_HelloBob {

	public static void main(String[] args) {
		/*
		 * Create a method that accepts 1 string, 
		 * e.g. "Bob", return a greeting of the form "Hello Bob!".
		 * helloName("Bob") 	→ "Hello Bob!"
		 * helloName("Alice")	→ "Hello Alice!"
		 * helloName("X")  		→ "Hello X!"
		 */
		
		
		System.out.println(helloName());
			
	}
		public static String helloName() {
			
			Scanner name = new Scanner (System.in);
				System.out.print("Enter a name : ");
				String name1 = name.nextLine();
								
			return "Hello " + name1.concat("!")  ;
		}
}
