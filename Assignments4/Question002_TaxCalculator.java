package assignments.Assignments4;

public class Question002_TaxCalculator {

	public static void main(String[] args) {
		/*  - Let user enter his income
			- Calculate the tax amount according to below table
		   	- Print the tax amount
 ----------------------------------   	
|		 Income			Tax Ratio  |
|income ≤ 150,000,000	  %25      |
|income ≤ 300,000,000	  %30      |
|income ≤ 600,000,000	  %35      |
|income ≤ 1,200,000,000	  %40      |
|income > 1,200,000,000	  %50      |
 ----------------------------------	
	Sample Output-1
		Your Income : 1500
		The tax amount you have to pay : 375.0
		Sample Output-2
		Your Income : 1200000
		The tax amount you have to pay : 300000.0
		
*Note: IF Your Income is 200,000,000, 
*your tax will be calculated this way: 
*%25 for 150,000,000 and 
*%30 for the rest of the amount which is 50,000,000 */
		
		int income = 30_000_000;
		double tax, taxRatio25 = 0.25, taxRatio30 = 0.3, taxRatio40 = 0.4, taxRatio50 = 0.5; 
		//BigDecimal TAX;
		
		tax = income * taxRatio25;
		
		System.out.println("Your Income : " + income);
		System.out.println("The tax amount you have to pay : " + tax);
		
	}

}
