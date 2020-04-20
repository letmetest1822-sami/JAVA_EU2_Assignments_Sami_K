package assignments.Assignment14_OOP;

public class Question02_LameCalculator {

/*
* The LameCalculator class has instance methods that can do simple math operations on two numbers.
* The methods are: plus, minus, multiply and divide.
* All the methods get two ints 
* then the method does the required math operation and 
* returns the result as an int.

	for example:

	LameCalculator lc = new LameCalculator();

	lc.plus(1,1)		lc.minus(1,1)		lc.multiply(1,2)		lc.divide(10,2)
	returns:2			returns:0			returns:2				returns:5
*/
	
	
	public int plus(int a, int b) {
		return a+b;	
	}
	
	public int minus(int a, int b) {
		return a-b;	
	}
	
	public int multiply(int a, int b) {
		return a*b;	
	}
	
	public int divide(int a, int b) {
		return a/b;	
	}
	
	//create a main method to run the code
	public static void main(String[] args) {
		
		//create an object
		Question02_LameCalculator lc = new Question02_LameCalculator();

		//call the method
		lc.plus(1,1);
		lc.minus(1,1);
		lc.multiply(1,2);
		lc.divide(10,2);
		System.out.println(lc.plus(1,1));
		System.out.println(lc.minus(1,1));
		System.out.println(lc.multiply(1,2));
		System.out.println(lc.divide(10,2));
	}

}
