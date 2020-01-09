package assignments.Assignments4;

public class Question007_Seconds {

	public static void main(String[] args) {
		/* There are 60 seconds in a minute. 
		 * If the number of seconds is greater than or equal to 60, 
		 * the program should display the number of minutes in that many seconds.
		 * There are 3600 seconds in an hour. 
		 * If the number of seconds is greater than or equal to 3600, 
		 * the program should display the number of hours in that many seconds.
		 * There are 86400 seconds in a day. 
		 * If the number of seconds is greater than or equal to 86400, 
		 * the program should display the number of days in that many seconds.
		 * 86400/gün - 3600/sa - 60/dk - 60/s */
		
		int days = 0, hours = 0, minutes = 0, seconds = 100000;
		
		if ((seconds>=60) && (seconds<3600)) {
			minutes = seconds/60;
			seconds = seconds%60;
			System.out.println("There are " + minutes  + " minutes " + seconds + " seconds in the given seconds");
			
		}else if ((seconds>=3600) && (seconds < 86400)) {
			hours = seconds/3600;
			minutes = (seconds%3600)/60;
			seconds = seconds%60;
			System.out.println("There are "+ hours + " hours " + minutes  + " minutes " + seconds + " seconds in the given seconds");
		}else if (seconds>= 86400) {
			days = seconds/86400;
			hours = (seconds%86400)/3600;
			minutes = (seconds%86400)%3600/60;
			seconds = seconds%60;
			System.out.println("There are "+ days + " days "+ hours + " hours " + minutes  + " minutes " + seconds + " seconds in the given seconds");
		}

	}

}
