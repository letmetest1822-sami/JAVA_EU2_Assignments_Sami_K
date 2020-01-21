package day14_MethodsContinue.Lab_1;

public class Question04_deerPlay {

	public static void main(String[] args) {
		/* The deers inVA spend most of the day playing. 
		 * In particular, they play if the temperature is between 60 and 90.
		 * Unless it is summer, then, the upper limit is 100 instead of 90.
		 * Write a method that accepts temperature and boolean isSummeri prints true if the deers play and false otherwise,
		 
		 deerPlay(70,false); --> true
		 deerPlay(95,false); --> false
		 deerPlay(95,true);  --> true
		 
		 */
		
		 deerPlay(70,false);
		 deerPlay(95,false);
		 deerPlay(95,true); 
	}

	public static void  deerPlay(int temperature, boolean isSummer) {
		if(((temperature>60) && (temperature<90) && (isSummer == false)) || (((temperature>60) && (temperature<100)) && (isSummer == true))) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
		}
	}
}
