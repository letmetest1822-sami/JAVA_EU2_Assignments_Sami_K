package assignments.Assignment13;

import java.util.ArrayList;

public class Question77_badProducts {

	public static void main(String[] args) {
		/*
		 * All products that go into the warehouse go through a machine that checks if they are intact.
		 * To declare if the shipment of the product was good or bad it also gets a limited number 
of how many products can be broken for it to be considered a good shipment.
		 * badP is a method that gets an int array named products and an int named limit.
		 
	* products(int[]) - is an int array representing the products it checked, 
if the item is intact it will be represented by 1 if it is broken its 0. 
	* for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.
	
	* limit(int) - represents the max amount of broken items for this shipment 
to be considered good (and the method returns true) 
	* for example: products [1,1,1,1,0] limit:3, 
	* there is only 1 broken product and it is less than the limit (3) return true.

Sample Output:

     badP([1,1,1,1],5)
     returns true

     badP([1,1,1,1,0,0,0,0],2)
     returns false

     badP([1,1,0,0],2)
     returns false

     badP([1,1,1,0],6)
     returns true
		 */

		int [] inputArray1 = {1,1,1,1};
		int inputLimit1 = 5;
		
		int [] inputArray2 = {1,1,1,1,0,0,0,0};
		int inputLimit2 = 2;
		
		int [] inputArray3 = {1,1,0,0};
		int inputLimit3 = 2;
		
		int [] inputArray4 = {1,1,1,0};
		int inputLimit4 = 6;
		
		System.out.println(badP(inputArray1, inputLimit1));
		System.out.println(badP(inputArray2, inputLimit2));
		System.out.println(badP(inputArray3, inputLimit3));
		System.out.println(badP(inputArray4, inputLimit4));

	}
	public static boolean badP(int[] products, int limit) {
		
		int count0 = 0;
		
		boolean flag = false;
		
			for(int each : products) {
				
				if(each == 0) {
					
					count0++;
			}
		}
			if(count0<limit) {
				
				flag = true;
		}
	return flag;
	}
}
