package assignments.Assignment09;

public class Question10_printInformation {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out information about the user based on email. 
		 * Print first and last name from the upper case.

		Sample Output:
     	Input					: craig_federighi@apple.com
    		Output:
           		First name		: Craig
           		Last name		: Federighi
           		Domain			: apple
           		Top-Level Domain: com
		 */

		String input = "craig_federighi@apple.com";
		printInformation(input);
		
		String input2 = "sami_karatas@gmail.com";
		printInformation(input2);
	}
	public static void printInformation(String word) {
		
		int n1 = word.indexOf('_');
		int n2 = word.indexOf('@');
		int n3 = word.indexOf('.');
		
		String firstName = word.substring(0,1).toUpperCase() + word.substring(1, n1);
		String lastName = word.substring(n1+1, n1+2).toUpperCase() + word.substring(n1+2, n2);
		String domain = word.substring(n2+1, n3);
		String topLevelDomain = word.substring(n3+1);
		
		System.out.println("First name	 : " + firstName);
		System.out.println("Last name	 : " + lastName);
		System.out.println("Domain		 : " + domain);
		System.out.println("Top-Level Domain : " + topLevelDomain + "\n");
	}
}
