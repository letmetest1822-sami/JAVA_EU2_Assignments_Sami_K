package assignments.Assignment14_OOP;

public class Question07_GasTank {
/*
* Write a class named GasTank containing:
* An instance variable named amount of type double, initialized to 0.
* An instance variable named capacity of type double.
* A constructor that accepts a parameter of type double. 
	-The value of the parameter is used to initialize the value of capacity.
* A method named addGas that accepts a parameter of type double. 
 	- The value of the amount instance variable is increased by the value of the parameter. 
	- However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
* A method named useGas that accepts a parameter of type double. 
	- The value of the amount instance variable is decreased by the value of the parameter. 
	- However, if the value of amount is decreased below 0, amount is set to 0.
* A method named isEmpty that accepts no parameters. 
	- isEmpty returns a boolean value: true if the value of amount is less than 0.1, and 
	- false otherwise.
* A method named isFull that accepts no parameters. 
	- isFull returns a boolean value: true if the value of amount is greater than capacity-0.1, and 
	- false otherwise.
* A method named getGasLevel that accepts no parameters. 
	- getGasLevel returns the value of the amount instance variable.
* A method named fillUp that accepts no parameters. 
	- fillUp increases amount to capacity and 
	- returns the difference between the value of capacity and the original value of amount 
	- (that is, the amount of gas that is needed to fill the tank to capacity).
	 */
	
	//instance variables 
	double amount = 0;
	double capacity;
	
	//constructor
	public Question07_GasTank(double capacity) {
		this.capacity = capacity;
	}

	//methods
	public void addGas(double addedAmountGas) {
		amount += addedAmountGas;
		if (amount >capacity) {
			amount = capacity;
		}
		System.out.println(addedAmountGas + " liters of gas asked to be added");
	}
	
	public void useGas (double usedAmountGas) {
		amount -= usedAmountGas;
		if (amount < 0) {
			amount = 0;
		}
		System.out.println(usedAmountGas + " liters of gas asked to be used");
	}
	
	public boolean isEmpty() {
		if (amount < 0.1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (amount >= (capacity-0.1)) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getGasLevel() {
		return amount;	
	}
	
	public double fillUp() {
		this.amount = amount;
		this.capacity = capacity;
		return capacity-amount;
	}
		
	public static void main(String[] args) {

		Question07_GasTank GT = new Question07_GasTank(50);
		
		GT.addGas(15);														//15.0 liters of gas asked to be added
		System.out.println("The amount in Tank : " + GT.getGasLevel() + " lt."); 	//The amount in Tank : 15.0
		System.out.println("----------");
		GT.useGas(5);
		System.out.println("The amount in Tank : " + GT.getGasLevel() + " lt."); 
		System.out.println("----------");
		GT.fillUp();
		System.out.println("The amount needed to fill the Tank up : " + GT.fillUp() + " lt."); 
		System.out.println("The amount in Tank : " + GT.getGasLevel() + " lt."); 
		System.out.println("----------");
		GT.addGas(45);
		System.out.println("The amount in Tank : " + GT.getGasLevel() + " lt."); 
		System.out.println("----------");
	}
}
