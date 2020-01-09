package assignments.Assignments4;

public class Question008_Discount {

	public static void main(String[] args) {
		/*  A software company sells a package that retails for $99.
		 *  Quantity discounts are given according to the following table:

				Quantity	Discount
				10-19		20%
				20-49		30%
				50-99		40%
				100 or more	50%
		*  Write a program that lets the user declare the number of packages purchased. 
		*  The program should then display the amount of discounts(if any) 
		*  and the total amount of the purchase after discount. */

		
		int quantity = 100;
		double discount;
		String discountRate;
		double totalAmount;
		
		if (quantity<10) {
			
			totalAmount = quantity * 99;
			System.out.println(quantity + " packages are purchased for " + totalAmount +"$ of total amount with no discount.");
		
		}else if (quantity>=10 && quantity<20) {
			
			discountRate = "20%";
			discount = ( quantity * 99 ) * 0.2;
			totalAmount = ( quantity * 99 ) * 0.8;
			System.out.println(quantity + " packages are purchased for " + totalAmount +"$ of total amount with a "
							  + discountRate +" discount rate that equals " + discount + "$ discount");
		
		}else if (quantity>=20 && quantity<50) {
			
			discountRate = "30%";
			discount = ( quantity * 99 ) * 0.3;
			totalAmount = ( quantity * 99 ) * 0.7;
			System.out.println(quantity + " packages are purchased for " + totalAmount +"$ of total amount with a "
							  + discountRate +" discount rate that equals " + discount + "$ discount");
		
		}else if (quantity>=50 && quantity<100) {
			
			discountRate = "40%";
			discount = ( quantity * 99 ) * 0.4;
			totalAmount = ( quantity * 99 ) * 0.6;
			System.out.println(quantity + " packages are purchased for " + totalAmount +"$ of total amount with a "
							  + discountRate +" discount rate that equals " + discount + "$ discount");
		
		}else if (quantity>=100) {
			
			discountRate = "50%";
			discount = ( quantity * 99 ) * 0.5;
			totalAmount = ( quantity * 99 ) * 0.5;
			System.out.println(quantity + " packages are purchased for " + totalAmount +"$ of total amount with a "
							  + discountRate +" discount rate that equals " + discount + "$ discount");
		}
	
	}

}
