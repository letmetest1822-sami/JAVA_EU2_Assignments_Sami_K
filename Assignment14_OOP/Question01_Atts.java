package assignments.Assignment14_OOP;

public class Question01_Atts {
	
/**
* The class Atts holds a few attributes and has a method called asString. 
* The attributes are name and color -both are strings and amount which is an int.
* Their visibility is public. asString returns a string showing all the Atts in a format.

for example:
				Atts a = new Atts();
					a.name = "table";
					a.color = "brown";
					a.amount = 1;
		System.out.println(a.asString());

		OUTPUT: 
		name: table color: brown amount: 1

Create the required attributes and method inside the atts class
*/
	//Create 3 variables as requested	
	public String name;
	public String color;
	public int  amount;
		
	//Auto create a no-name constructor	to be able to use the variable in main
	public Question01_Atts() {	
		this.name = name;
		this.color = color;
		this.amount = amount;
	}

	//create a method
	public String asString() {
		return "name : " + name + " color : " + color + " amount : " + amount;		
	}	
	
		//create a main method to run the code
		public static void main(String[] args) {
		
			//create an object and invoke the no-name constructor
			Question01_Atts a = new Question01_Atts();
			a.name   = "table";
			a.color  = "brown";
			a.amount = 1;

			//call the method asString - (sout it because it is returning a String)
			System.out.println(a.asString());
	}
}
