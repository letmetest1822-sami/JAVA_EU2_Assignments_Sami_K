package assignments.Assignment5;

import java.util.Scanner;

public class Question10_HTTP {

	public static void main(String[] args) {
		/* HTTP is the protocol that governs communications between web servers and web clients 
		 * (i.e. browsers). Part of the protocol includes a status code returned by the server 
		 * to tell the browser the status of its most recent page request. 
		 * Some of the codes and their meanings are listed below:
HTTP STATUS CODE

CODE	DESCRIPTION			CODE	DESCRIPTION
200		OK					400		Bad Request
201		Created				401		Unauthorized
202		Accepted			403		Forbidden
301		Moved Permanently	404		Not found
303		See other			410		Gone
304		Not modified		500		Internal Server Error
307		Temporary Redirect	503		Service Unavailable
 
	* Given an int variable status, write a switch statement that prints out, on a line by itself, 
	* the appropriate label from the above list based on status. 
	* Otherwise, print warning message: "Invalid status code!".

			Example:
				Display message	: "Enter status code:"
				input			:  200
				Display message	: "OK" 					*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter status code :");
		int code = input.nextInt();
		input.close();
		
		switch (code) {
		case 201:
			System.out.println("Created");
			break;
		case 200:
			System.out.println("OK");	
			break;
		case 202:
			System.out.println("Accepted");
			break;
		case 301:
			System.out.println("Moved Permanently");
			break;
		case 303:
			System.out.println("See other");
			break;
		case 304:
			System.out.println("Not modified");
			break;
		case 307:
			System.out.println("Temporary Redirect");
			break;
		case 400:
			System.out.println("Bad Request");
			break;
		case 401:
			System.out.println("Unauthorized");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 404:
			System.out.println("Not found");
			break;
		case 410:
			System.out.println("Gone");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;
		case 503:
			System.out.println("Service Unavailable");
			break;
			default:
				System.out.println("Invalid status code!");
		}

	}

}
