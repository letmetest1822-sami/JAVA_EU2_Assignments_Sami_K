package assignments.Assignment14_OOP;

public class Question06_ParkingMeter {
/*
 * Write a class named ParkingMeter containing:
 * Two instance variables named timeLeft and maxTime of type int. 
 * The value of timeLeft should be initialized to 0.
 * A constructor accepting a single integer parameter whose value is used to initialize the maxTime instance variable.
 * A method named add that accepts an integer parameter. 
	-If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; 
	-otherwise, no increase is performed. 
	-Furthermore, the increase occurs only if the value of timeLeft will not exceed the value of maxTime. 
	-add returns a boolean value: 
		+true if timeLeft was increased, 
		+false otherwise.
 * A method named tick that accepts no parameters and returns no value. 
 	- tick decreases the value of timeLeft by 1, 
 	- but only if the value of timeLeft is greater than 0.
 * A method named isExpired that accepts no parameters. 
 	- isExpired returns a boolean value: 
 		+ true if the value of timeLeft is equal to 0; 
 		+ false otherwise.
	 */
	
	//instance variables
	int timeLeft = 0;
	int maxTime;
	
	//constructor
	public Question06_ParkingMeter() {
		
	}

	public Question06_ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int givenTime) {
		
		if((givenTime==25)  && (timeLeft<=maxTime)) {
			timeLeft+=30;
			return true;
		}else {
			return false;
		}
	}
	
	public void tick() {
		
		if (timeLeft>0) {
			timeLeft--;
		}
	}
	
	public boolean isEXpired() {
			
		if (timeLeft==0) {
			return true;
		}else {
			return false;
		}
	}
	//create a main method to run the code
	public static void main(String[] args) {
		
		Question06_ParkingMeter PM1 = new Question06_ParkingMeter(50);
		
		System.out.println("add : "+PM1.add(25));				//add : true
		System.out.println("---------------");
		System.out.println("isEXpired : "+PM1.isEXpired());		//isEXpired : false
		System.out.println("---------------");
		System.out.println("add : "+PM1.add(45));				//add : false
		System.out.println("---------------");
		System.out.println("isEXpired : "+PM1.isEXpired());		//isEXpired : false
		System.out.println("---------------");
		System.out.println("Time left is : " + PM1.timeLeft);	//Time left is : 30
		System.out.println("---------------");
		System.out.println("maxTime : "+PM1.maxTime);			//maxTime : 50
		System.out.println("---------------");
		
		//check if tick is functioning
		for (int i = PM1.timeLeft; i>-5; i--) {
			PM1.tick();
			System.out.println("Time left is : " + PM1.timeLeft);
		}
	}

	

}
