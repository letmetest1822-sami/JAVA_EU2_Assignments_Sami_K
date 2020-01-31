package assignments.Assignment8_Methods;

public class Question03_HelloWorld {

	public static void main(String[] args) {
		/* Create 2 methods called hello() and world(). 
		 * Provide an implementation for both of them in order to print an appropriate message. 
		 * So hello() method should print "Hello" 
		 * and world() method should print "World!".
		 
		 output: Hello World!
		 
		 */


		hello();
		
		world();
		
	}
	public static void hello() {
	
		String w1 = "Hello ";
	
		System.out.print(w1);
	}

	public static void world() {
	
		String w2 = "World!";
		System.out.println(w2);
	}
}
