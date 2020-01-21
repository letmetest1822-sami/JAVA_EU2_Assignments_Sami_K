package day14_MethodsContinue.Lab_1;

public class Question05_caughtSpeeding {

	public static void main(String[] args) {
		/* 
		 * You are driving a little too fast, and a police officer stops you. 
		 * Write a method to compute the result:
		 	result 0 = no ticket,		if speed is 60 or less
		 	result 1 = small ticket, 	if speed is between 61 and 80
		 	result 2 = big ticket, 		if speed is more than 81
		 	
		 	isBirthday=true,	on that day your speed can be 5 higher in all cases
		
		 			caughtSpeeding(60,false)    -->	  0
		 			caughtSpeeding(65,false)    -->	  1
		 			caughtSpeeding(65,true)     -->	  0
		 */
		
			//System.out.println("case 1");
			caughtSpeeding(60,false);
			//System.out.println("\ncase 2");
			caughtSpeeding(65,false);
			//System.out.println("\ncase 3");
			caughtSpeeding(65,true);
			//System.out.println("\ncase 4");
			caughtSpeeding(85,false);
			//System.out.println("\ncase 5");
			caughtSpeeding(85,true);
	}

	public static void caughtSpeeding(int speed, boolean isBirthday) {
		
		if (((speed <= 60) && (isBirthday==false)) || ((speed <= 65) && (isBirthday==true)) ) {
			int result = 0;
			System.out.println(result + " No Ticket");
			
		}else if ( ( ((speed >= 60) && (speed <= 80))  && (isBirthday==false) ) || (((speed >= 65) && (speed <= 85)) && (isBirthday==true)) ) {
			int result = 1;
			System.out.println(result + " Small Ticket");
			
		}else if (((speed > 80) && (isBirthday==false)) || ( (speed > 85) && (isBirthday==true)))  {
			int result = 2;
			System.out.println(result + " Big Ticket");
		}
		
	}
}
