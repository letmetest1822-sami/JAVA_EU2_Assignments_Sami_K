package assignments.Assignments4;

public class Question006_calculateWeight {

	public static void main(String[] args) {
		/*   Weight = Mass * 9.8
		 *   Write a program that asks the user to enter an object's mass,
		 *   and then calculate its weight. If the object weighs more than 1000 Newtons, 
		 *   display a message indicating that it is too heavy. 
		 *   If the object weighs less than 10 Newtons, 
		 *   display a message indicating that the object is too light.*/

		double  Weight, Mass = 1;
		Weight = Mass * 9.8;
		
		if (Weight>1000) {
			System.out.println("The object is too heavy.");
			
		}else if (Weight<10) {
			System.out.println("The object is too light.");
		}else {
			System.out.println("normal");
		}

}
}