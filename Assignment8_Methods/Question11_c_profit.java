package assignments.Assignment8_Methods;

import java.util.Scanner;

public class Question11_c_profit {

	public static void main(String[] args) {
		/*
		 * c_profits gets the buyPrice(int) and sellPrice(int) and 
		 * determines if there was a profit or loss.
		 * it returns a string value that can be "profit","loss","no loss"

					for example:
						c_profits(100,1500)
							returns : "profit"

						c_profits(20,5)
							returns : "loss"

						c_profits(100,100)
							returns : "no loss"
		 */

		
		System.out.println(c_profits(buyPrice(), sellPrice()));
		
	}

	public static String c_profits (int a, int b) {
		
		
		a = buyPrice();
		b = sellPrice();
		String str=  "";
				
		if (a<b) {
			str = "profit";			
		
			
		}else if (a>b) {
			str = "loss";	
			
			
		}else if (a==b) {
			str = "no loss";
			
		}
		
		return str;
	}

	
	public static int buyPrice() {
		
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter the buying price : ");
	
		int x1 = number.nextInt();
		
		return x1;
		
	}
	public static int sellPrice() {
		
		Scanner number = new Scanner (System.in);
		
		System.out.print("Please enter the selling price : ");
	
		int y1 = number.nextInt();
		
		return y1;
		
	}
}
