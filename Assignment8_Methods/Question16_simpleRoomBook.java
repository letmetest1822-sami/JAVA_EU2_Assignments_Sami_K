package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question16_simpleRoomBook {

	public static void main(String[] args) {
		/*
		 * To book a room first it needs to be available for rent and make sure its available at the date selected:
		 * the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
		 */

		Scanner input = new Scanner (System.in);
			System.out.print("Available true or false?");
			Boolean available = input.nextBoolean();
			
			System.out.print("Day : ");
			int day = input.nextInt();
			
			System.out.print("Month : ");
			int month = input.nextInt();
			
			System.out.print("Year : ");
			int year = input.nextInt();
			
			System.out.println(simpleRoomBook(available, day, month,year));
					
	}

	public static boolean simpleRoomBook(boolean available, int day, int month, int year) {
		boolean book = false;
		
	if((available==true) && (year==2018) && (((day>=1)&&(day<7))&&(month==1)) || 
			(  (  (day>=1)&&(day<=31)  )  &&  (  (month>=1)||(month>=12)  )  )  ) {
		book = true;
		
		System.out.print("Reservation Confirmed? : ");
		
	}
		
		return book;
		
	}
}
