package assignments.Assignment09;

public class Question08_findAlejandro {

	public static void main(String[] args) {
		/*
		 * Alejandro have started learning java, he knows what you know about ifs and strings. 
		 * He has a large number of text emails, going through all of them will take a lot of time. 
		 * To save time he will only read the emails that refer to him by name. 
		 * He wants to write a program that gets a string (the email) 
		 and determines if his name "Alejandro" appears in that string. 
		 * if so it will output "read this mail" else it will output "don't read".

Sample Output:

     input: "dear alejandro.....alot of text"
     output: "read this mail"

     input: "thunder blaz is the best drink in the galaxy..."
     output: "don't read"

     input: "subject: important project, Alejandro we refer to you this ...."
     output: "read this mail"
		 */

		String email = "dear Alejandro.....alot of text";
		
		findAlejandro(email);
	}
	public static void findAlejandro(String email) {
	
		boolean flag = false;
		for (int i = 0; i< email.length();   i++) {
			if( ( (email.charAt(i) == 'a') || (email.charAt(i) == 'A') ) && (email.substring(i, i+9)).equalsIgnoreCase("alejandro")) {
		
				System.out.println("read this mail");
				
				flag = true;
				break;
			}		
		}
		if (flag == false) {
			System.out.println("don't read");
		}
	}
}
