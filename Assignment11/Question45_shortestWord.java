package assignments.Assignment11;

public class Question45_shortestWord {

	public static void main(String[] args) {
		/*
		 * Write a program that will print the shortest word in the given array str.

Sample Output:

     input: java, cable, red, vivid, remedy, grace
     output: red
		 */
		String [] input = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		shortestWord(input);
	}
	public static void shortestWord(String [] arr) {
		
		String shortest = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			
			if(arr[i].length() < shortest.length() ) {
				
				shortest = arr[i];
			}
		}
		System.out.println(shortest);
	}
}
