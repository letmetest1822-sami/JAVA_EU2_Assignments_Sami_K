package assignments.Assignment11;

public class Question39_printIDandDomain {

	public static void main(String[] args) {
		/*
		 * Given a String variable email, 
		 * write code using split method to print email id and domain in separate lines.
		 * If email contains no @ character or multiple @ characters then print invalid email:

Sample Output:
     email -> info@cybertekschool.com
     Print:
     Email id: info
     Email domain: cybertekschool.com
     
     
     email -> hello-gmail.com
     print:
     invalid email

     email -> my@fancy@email.com
     print:
     invalid email
		 */

		String email1 = "info@cybertekschool.com";
		String email2 = "hello-gmail.com";
		String email3 = "my@fancy@email.com";
		
		printIDandDomain(email1);
		printIDandDomain(email2);
		printIDandDomain(email3);
	}
	public static void printIDandDomain(String word) {
		
		int count = 0;
		
		for (int i = 0; i<word.length();i++) {
			
			if (word.charAt(i)=='@') {
				
				count++;
			}
		}
		
		if (count == 1) {
			
			System.out.println("Email id  	: " + word.split("@" )[0]);
			
			System.out.println("Email domain 	: " + word.split("@" )[1] + "\n");
		}
		else if ((count == 0) || (count > 1)) {
			
			System.out.println("invalid email\n");
		}
	}
}