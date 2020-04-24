package assignments.Assignment14_OOP;

public class Question10_Calculator {
/*
 * A static method can be used without instantiating a class object.
 * Like in the calculator class create a plus and minus. 
 * but this time make them static methods. 
 * plus: gets two ints and 
 	- returns the addition of the to numbers as an int   
 * minus: the same as plus its also static, but it 
 	- returns the subtracted value of the two ints it gets

calc.minus(1,1)
returns:0

calc.plus(10,1)
returns:11
 */
	
	//static methods
	public static int plus(int a, int b) {
		return a+b;
		
	}
	
	public static int minus(int a, int b) {
		return a-b;
		
	}
	
	//create a main method to run the code
	public static void main(String[] args) {
		
		System.out.println(plus(2,3));
		System.out.println(minus(5,3));

	}

}
