package assignments.Assignment5;

public class Question02_num1_num2 {

	public static void main(String[] args) {
		/* Declare and assign value for num1 and num2 variables

Using Multi-Branch if statements, check if num1 and num2 are equal, or not. 
Please follow the below examples and print message accordingly:


num1 = 10
num2 = 10
10 and 10 are equal


num1 = 100
num2 = 55
100 is greater than 55


num1 = 33
num2 = 333
333 is greater than 33 */
		int num1 = 333, num2 = 33;
		
		 if (num1 == num2) {
			 System.out.println(num1 + " and " + num2 + " are equal.");
		 
		 }else  if (num1 > num2) {
			 System.out.println(num1 + " is greater than " + num2);
		 
		 }else  if (num2 > num1) {
			 System.out.println(num2 + " is greater than " + num1);
		 }
	}

}
