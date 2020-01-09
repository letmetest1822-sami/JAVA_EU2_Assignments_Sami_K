package assignments.Assignments4;

public class Question009_FastFreightShippingCompany {

	public static void main(String[] args) {
		/* The Fast Freight Shipping Company charges the following rates:
		 
							Weight of Package				Rate per 500 Miles Shipped
									2 pounds or less				$1.10
				Over 2 pounds but not more than 6 pounds			$2.20
				Over 6 pounds but not more than 10 pounds			$3.70
											Over 10 pounds			$3.8
											
		* The shipping charges per 500 miles are not prorated.
		* For example, if a 2-pound package is shipped 550 miles,the charges would be $2.20. 
		* Write a program that lets the user declare the weight of a package 
		* and then displays the shipping charges. */
		
		int distance = 501, weightOfPackage = 11;
		double shippingCharges=1;
		
		if (weightOfPackage <= 2) {
					if ((distance%500)!=0) {
					shippingCharges = ((distance/500)+1)*1.1;
					}else {shippingCharges = (distance/500)*1.1;}
					System.out.println("The shipping charge is : " + shippingCharges);
					

		
		}else if ((weightOfPackage > 2) && (weightOfPackage <=6)) {
				if ((distance%500)!=0) {
				shippingCharges = ((distance/500)+1)*2.2;
		
			}else  {shippingCharges = (distance/500)*2.2;}
				System.out.println("The shipping charge is : " + shippingCharges);
				
				
				
		}else if ((weightOfPackage > 6) && (weightOfPackage <=10)) {
				if ((distance%500)!=0) {
				shippingCharges = ((distance/500)+1)*3.7;
	
				}else  {shippingCharges = (distance/500)*3.7;}
				System.out.println("The shipping charge is : " + shippingCharges);
				
				
				
		}else if (weightOfPackage >10) {
				if ((distance%500)!=0) {
				shippingCharges = ((distance/500)+1)*3.8;

				}else  {shippingCharges = (distance/500)*3.8;}
				System.out.println("The shipping charge is : " + shippingCharges);
		}
	}
}
