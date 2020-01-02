package assignments.day_4_arithmeticOperators;

public class Question4_swapNums {

	public static void main(String[] args) {
		/*Declare 2 variables (Num1, Num2)
		 * Swap values between Num1 and Num2
		 * Display new values of Num1 and Num2
		 */
	int Num1 = 10;
	int Num2 = 20;
		
	int swap1=0;
	int swap2=0;
	
	swap1=Num1;
	swap2=Num2;
	
	Num1=swap2;
	Num2=swap1;
	
	System.out.println( "First  number was : "+ swap1+ " but now it is " + Num1);
	System.out.println( "Second number was : "+ swap2+ " but now it is " + Num2 + "\n");
	
	System.out.println("n1="+swap1);
	System.out.println("n2="+swap2);
	System.out.println("----------");
	System.out.println("n1="+Num1);
	System.out.println("n2="+Num2);

	}

}
