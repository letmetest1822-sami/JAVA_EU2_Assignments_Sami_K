package day14_MethodsContinue.Lab_1;

public class Question03_specialEleven {

	public static void main(String[] args) {
		
		/* we'll say a number  is special that is multiple of 11
		 * or if it is one or more than multiple of 11.
		 * Write a method that accepts a number and prints true if the given number is special.
		 
		 specialEleven(22) -->  true
		 specialEleven(23) -->  true
		 specialEleven(24) -->  false
		 
		 */

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		
	}

	public static void specialEleven(int a) {
		
		if( (a%11==0) || (a%11==1)) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
		}
		
	}
}
