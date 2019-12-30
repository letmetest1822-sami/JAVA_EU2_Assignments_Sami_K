package assignments.day_3_variables;

public class Question6 {

	public static void main(String[] args) {
		/* 	-James doesn't want to sit next to Jill
			-Betty and Herb are dating and want to sit next to each other
			-Bob wants to sit on a left side aisle
			-James wants to sit on the aisle
			Provide a seating order that conforms to the above rules.
			Specify the seating order as the names separated by commas and space (as in the above example).
			Use variables and print names in the right order.*/

		String s1 = "James";
		String s2 = "Betty";
		String s3 = "Herb";
		String s4 = "Bob";
		String s5 = "Jill";
				
		System.out.println(s4 + ", " + s5 + ", " +  s2 + ", " + s3 + ", "  +  s1);
		System.out.println(s4 + ", " + s5 + ", " +  s3 + ", " + s2 + ", "  +  s1);

	}

}
