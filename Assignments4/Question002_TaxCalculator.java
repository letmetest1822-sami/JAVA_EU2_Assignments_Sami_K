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
		
		int income = 200_000_000;
		double tax, taxRatio25 = 0.25, taxRatio30 = 0.3, taxRatio35 = 0.35, taxRatio40 = 0.4, taxRatio50 = 0.5; 
		//BigDecimal TAX;
		
		System.out.println("Your Income : " + income);
		
		if ( income <= 150_000_000) {
			tax = income * taxRatio25;
			System.out.println("The tax amount you have to pay : " + tax);
		
		}else if ( (income > 150_000_000) && (income <= 300_000_000)) {
			tax = (150_000_000 * taxRatio25) +  (income - 150_000_000) * taxRatio30;
			System.out.println("The tax amount you have to pay : " + tax);
		
		}else if ( (income > 300_000_000) && (income <= 600_000_000)) {
			tax = (150_000_000 * taxRatio25) + (150_000_000 * taxRatio30) + (income - 300_000_000) * taxRatio35 ;
			System.out.println("The tax amount you have to pay : " + tax);
		
		}else if ( (income > 600_000_000) && (income <= 1_200_000_000)) {
			tax = (150_000_000 * taxRatio25) + (150_000_000 * taxRatio30) + (300_000_000 * taxRatio35)+ (income - 600_000_000) * taxRatio40 ;
			System.out.println("The tax amount you have to pay : " + tax);
		
		}else if (income > 1_200_000_000) {
			tax = (150_000_000 * taxRatio25) + (150_000_000 * taxRatio30) + (300_000_000 * taxRatio35)+ (600_000_000 * taxRatio40) + (income - 1_200_000_000) * taxRatio50  ;
			System.out.println("The tax amount you have to pay : " + tax);
		}
		
		
		
		
		
	}

}
