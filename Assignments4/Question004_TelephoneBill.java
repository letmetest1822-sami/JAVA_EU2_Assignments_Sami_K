package assignments.Assignments4;

public class Question004_TelephoneBill {

	public static void main(String[] args) {
		/* Write a Java program to calculate the monthly telephone bills as per the following rule: 
		 * Minimum $200 for up to 100 calls. 
		 * Plus $0.60 per call for the next 50 calls. 
		 * Plus $0.50 per call for the next 50 calls. 
		 * Plus $0.40 per call for any call beyond 200 calls.*/

		double monthlyBill=0, NumOfCalls=100, plus50= 0.6, plusNext50 = 0.5, plusByond200 =0.4;
		
		if (NumOfCalls<=100 ) {
			monthlyBill=200;
			//Minimum bill up to 100 calls
			System.out.println("Your bill is at minimum of :" + monthlyBill + "$ you had less than 100 calls.");
			
		}else if ((NumOfCalls>100) && (NumOfCalls<150) ) {
			monthlyBill=200 + ((NumOfCalls-100)*0.6);
			//Minimum bill + 0.6 cent per every calls up to 150 calls.
			System.out.println("Your bill is :" + monthlyBill + "$ you had " + NumOfCalls +  " calls.");
			
		}else if ((NumOfCalls>=150) && (NumOfCalls<200) ) {
			monthlyBill=200 + (50*0.6)+ ((NumOfCalls-150)*0.5);
			//Minimum bill + 0.6 cents for first extra 50 calls. + 0.5 cents for second extra 50 calls.
			System.out.println("Your bill is :" + monthlyBill + "$ you had " + NumOfCalls +  " calls.");
		
		}else if (NumOfCalls>=200) {
			monthlyBill=200 + (50*0.6)+ (50*0.5) +((NumOfCalls-200)*0.4);
			//Minimum bill + 0.6 cents for first extra 50 calls. + 0.5 cents for second extra 50 calls. + 0.4 cents/calls for every extra calls after 200 
			System.out.println("Your bill is :" + monthlyBill + "$ you had " + NumOfCalls +  " calls.");
		}
		
		
	}

}
