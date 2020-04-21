package assignments.Assignment14_OOP;

public class Question08_Value {

/*
 * Write a class definition of a class named 'Value' with the following:
 * a constructor accepting a single integer parameter
 * a constructor with no parameters
 * a method 'setVal' that accepts a single parameter,
 * a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
 * a method 'getVal' that returns an integer value as follows: 
 	- if setVal has ever been called, it getVal returns the last value passed to setVal. 
 	- Otherwise if the "single int parameter" constructor was used to create the object, 
 	getVal returns the value passed to that constructor. 
 	- Otherwise getVal returns 0.
 */
	
	//Variable
	int defaultValue = 34785;
	int newValue = 9363;
	
	//Constructor will create the starting value
	public Question08_Value(int startingValue) {
	this.defaultValue = startingValue;
	}
	
	public Question08_Value() {
		
	}
	
	//Methods
	public void setVal(int num) { //This method will set a new value
		
		newValue = num;
	}
	
	public boolean wasModified() {
		
		if(newValue !=9363) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getValue() {
		int lastValue;
		if(wasModified()==true) {
			lastValue = newValue;
		}
		
		else if (defaultValue != 34785) {
			lastValue = defaultValue;
		}
		else {
			lastValue = 0;
		}
		return lastValue;
	}

	public static void main(String[] args) {
		
		//Constructor didn't assign, setValue is not called
		Question08_Value val1 = new Question08_Value();
		System.out.println(val1.getValue());					// 0
		
		//Constructor assigned a value, setValue is called
		Question08_Value val2 = new Question08_Value(50);
		val2.setVal(45);
		System.out.println(val2.getValue());					// 45
		
		//Constructor assigned a value, setValue is not called
		Question08_Value val3 = new Question08_Value(50);
		System.out.println(val3.getValue());					// 50


	}

}
