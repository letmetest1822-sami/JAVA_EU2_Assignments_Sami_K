package assignments.day_4_arithmeticOperators;

public class Question5_SecMinHours {

	public static void main(String[] args) {
		/*Write a program that outputs the number of hours, minutes, 
		 * and seconds that corresponds to input total seconds. */

		int hour, hourRemain, min, totalMin, minRemain, sec, totalSec=3695;
		//These are our variables. Only the total seconds to convert will be given.
		
		minRemain=totalSec-(totalSec%60); 
		/* This will convert given total seconds to 
		 * minutes except the remaining seconds less than one minute.*/
		
		totalMin = minRemain/60;
		min=totalMin%60;
		/* This will  give us how many minutes we have less than one hour
		 * after taking the number of hours from total minutes .*/
		
		hourRemain=(totalMin-(totalMin%60))/60;
		hour=hourRemain%60;
		// This will  give us how many hours we have 
			
		sec= totalSec%60;
		
		// This will  give us how many seconds remaining we have less than a minute.
		
		System.out.println(hour+ " hours, "+ min + " minutes, "+ sec + " seconds.");
	}

}
