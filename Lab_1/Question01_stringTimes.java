package day14_MethodsContinue.Lab_1;

public class Question01_stringTimes {

	public static void main(String[] args) {
		/* Write a method that accepts a string and a non-negative number, 
		 * and prints a larger string that is number copies of the original string
		 * stringTimes("Hi",2):=>HiHi
		 * stringTimes("Hi",3):=>HiHiHi
		 * stringTimes("Hi",1):=>Hi
		 */
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);
		
	}

	public static void stringTimes(String  a, int b) {
		
		for (int i=1; i<=b;  i++) {
			
			System.out.print(a); 
		}
			System.out.println();
	}
}
