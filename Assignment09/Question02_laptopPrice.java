package assignments.Assignment09;

import java.util.Scanner;

public class Question02_laptopPrice {

	public static void main(String[] args) {
		/*
		 * Write a program that will calculate laptop price based on the components.
		 * First, ask user for screen size.
		 	- If screen size equals to 13.3 - add $200 to the laptop price. 
		 	- If screen size equals to 15.0 - add $300 to the laptop price. 
			- If screen size equals to 17.3 - add $400 to the laptop price.
			
		 * Then ask the user for CPU type. 
		 	- If CPU type equals to i3, add $150 to the laptop price. 
		 	- If CPU type equals to i5, add $250 to the laptop price.
		 	- If CPU type equals to i7, add $350 to the laptop price.
		 	
		 * Then ask the user for RAM size. 
		 	- Add $50 for every 4GB of ram to the laptop price.
		 	
		 * Then, ask the user for the storage type.
		 	- There are 2 options: SSD and HDD. 
		 	- If it's HDD - add $50 to the laptop price for every 500 gb.
		 	- If it's SSD - add $100 to the laptop price for every 500 GB.
		 	
		 * Then ask the user for screen resolution. 
		 	- There are 2 options: FULLHD and 4K. 
		 	- Add $100 if it's FULLHD screen 
		 	- Add $200 if it's 4K screen.

				Sample Output:

					Display message	: Select screen size:
							input	: 13.3
					Display message	: Select CPU type:
							input	: i7
					Display message	: Select RAM size:
							input	: 8
					Display message	: Select storage type:
							input	: SSD
					Display message	: Enter memory size:
							input	: 1000
					Display message	: Enter screen resolution:
							input	: 4K
							
					Display message	: Laptop price is: $1050.0
					
				Example #2

					Display message	: Select screen size:
							input	: 13.3
					Display message	: Select CPU type:
							input	: i3
					Display message	: Select RAM size:
							input	: 4
					Display message	: Select storage type:
							input	: HDD
					Display message	: Enter memory size:
							input	: 500
					Display message	: Enter screen resolution:
							input	: FULLHD
							
					Display message	: Laptop price is: $550.0
		 */
		
		calculateLaptopPrice();
	}
	
	public static void calculateLaptopPrice(){
		
	int laptopPrice = 0;
		
	Scanner input = new Scanner (System.in);
	
		System.out.print("Select screen size  : ");
		double screenSize = input.nextDouble();
		
			if (screenSize == 13.3){
				laptopPrice += 200; 
			}
			else if (screenSize == 15.0){
				laptopPrice += 300; 
			}
			else if (screenSize == 17.3){
				laptopPrice += 400; 
			}
			
		System.out.print("Select CPU type     : ");
		String cpuType = input.next();
		
			if (cpuType.equalsIgnoreCase("i3")) {
				laptopPrice += 150; 
			}
			else if (cpuType.equalsIgnoreCase("i5")) {
				laptopPrice += 250; 
			}
			else if (cpuType.equalsIgnoreCase("i7")) {
				laptopPrice += 350; 
			}
		
		System.out.print("Select RAM size     : ");
		int ramSize = input.nextInt();
		
			int i = ramSize/4;
				do {
					laptopPrice += 50;
					i--;
			
				}while(i>0); 
		
		System.out.print("Select storage type : ");
		String storageType = input.next();
		
		System.out.print("Enter memory size   : ");
		int memorySize = input.nextInt();
		
			if (storageType.equalsIgnoreCase("HDD")) {
				int j = memorySize/500;
				do {
					laptopPrice += 50;
					j--;
			
				}while(j>0); 
			}
			
			else if (storageType.equalsIgnoreCase("SSD")) {
				int k = memorySize/500;
				do {
					laptopPrice += 100;
					k--;
			
				}while(k>0); 
			}
		
		System.out.print("Enter screen resolution : ");
		String screenResolution = input.next();
		
			if (screenResolution.equalsIgnoreCase("FULLHD")) {
				laptopPrice += 100;
			}
			else if (screenResolution.equalsIgnoreCase("4K")) {
				laptopPrice += 200;
			}
		
		System.out.println("Laptop price is: $ " + laptopPrice);
				
	}
	

}
