package assignments.Assignment09;

public class Question11_declareVariables {

	public static void main(String[] args) {
		/*
		 * We have a message variable already declared and assigned value in this format

	Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

	Declare variables: sender, phoneNumber, messageBody

	By using String methods: 
	- retrieve related information from SMS message string 
	- assign it to those 3 variables 
	- print each variable in a separate line

			Sample Output:

				Sender       : Mike Smith
				Phone Number : 202-123-3456
				Message body : I love programming and problem solving
		 */

		String message1 = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		String message2 = "Sender:<Sami Karatas>. From Number:[555-555-5555]. Message:{I have to earn a lot of money!}";
		
		declareVariables(message1);
		declareVariables(message2);
	
	
	}
	public static void declareVariables(String word) {
	
		int n1 = word.indexOf('<');
		int n2 = word.indexOf('>');
		
		int n3 = word.indexOf('[');
		int n4 = word.indexOf(']');
		
		int n5 = word.indexOf('{');
		int n6 = word.indexOf('}');
		
		String sender = word.substring(n1+1, n2);
		String phoneNumber = word.substring(n3+1, n4);
		String messageBody = word.substring(n5+1, n6); 
		
		System.out.println("Sender       : " + sender);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Message body : " + messageBody + "\n");
}
}
