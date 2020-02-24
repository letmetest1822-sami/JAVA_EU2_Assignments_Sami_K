package assignments.Assignment09;

public class Question15_catDog {

	public static void main(String[] args) {
		/*
		 * Print true if the string "cat" and "dog" appear the same number of times in the given string word.
		 

Sample Output:

     input: catdog
     output: true

     input: catcat
     output: false

     input: cat-cheetah-dog-cat
     output: false
		 */
		String input = "catcat";
		String input1 = "catdog";
		String input2 = "catcatdogdog";
		
		System.out.println(catDog(input)); 
		System.out.println(catDog(input1));
		System.out.println(catDog(input2));
	}
	public static boolean catDog(String word) {
	
		boolean flag = false;
		int countCat = 0;
		int countDog = 0;
		
		for (int i = 0; i< word.length();i++) {
			if ((word.charAt(i) == 'c') && (word.substring(i,i+3).equalsIgnoreCase("cat"))){
				countCat++;
			}
			else if ((word.charAt(i) == 'd') && (word.substring(i,i+3).equalsIgnoreCase("dog"))){
				countDog++;
			}
		}
		if (countDog == countCat) {
			flag = true;
		}
		return flag;
		
}
}
