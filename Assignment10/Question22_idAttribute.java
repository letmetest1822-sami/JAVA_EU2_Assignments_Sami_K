package assignments.Assignment10;

public class Question22_idAttribute {

	public static void main(String[] args) {
		/*
		 * Hypertext Markup Language (HTML) is the standard markup language for creating web pages and web applications.
		 * HTML is the language in which most websites are written. 
		 * HTML is used to create pages and make them functional.
		 * Write a program, that will read HTML variable and 
		 * output attribute value of id attribute (tag) into the console. 
		 * Input will be provided in a single line as outlined below. 
		 * If HTML variable doesn't contain <html> attribute, 
		 * print out into the console message: "Invalid input!".

Sample Output:

     input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
     output: myid
		 */
	
		String input = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
	     
		idAttribute(input);
	}
	public static void idAttribute(String word) {
	
		String id = "";
		
	for (int i=0;  i<word.length()-3;   i++){
		
		if(!word.contains("<html>")) {
			
			System.out.print("Invalid input!");
			break;
		}
		
		if(word.charAt(i) =='"')  {
			do {
				
				id += (word.substring(i+1, i+2));
				i++;
				continue;
				}
			while ((word.charAt(i+1) != '"'));
			
		}
		System.out.print(id);
	
		if(id!="") {
		break;
	}
	}
	
	}
}

