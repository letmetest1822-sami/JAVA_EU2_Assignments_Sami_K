package assignments.Assignment10;

public class Question31_isPalindrom {

	public static void main(String[] args) {
		/*
		 * Palindrome is a word, phrase, or sequence that reads the same backward as forward, 
		 * e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though there is space in between.

Sample Output:

     isPalindrome("Noon") ==> true

     isPalindrome("I am not palindrome") ==> false

     isPalindrome("wooden") ==> false

     isPalindrome("Nurses Run") ==> true
		 */
		
		isPalindrome("Noon");
		isPalindrome("I am not palindrome");
		isPalindrome("wooden");
		isPalindrome("Nurses Run");
	}
	public static void isPalindrome(String word) {
		
		String omitSpaces = word.replace(" ", "").toLowerCase();

		String reverse = "";
		
		Boolean flag = false;
		
		for (int i = omitSpaces.length()-1;   i>=0;   i--){
			
			reverse += omitSpaces.substring(i,i+1);
			
		}
		if (reverse.equals(omitSpaces)) {
			
		flag = true;
		}
		System.out.println(flag);
	}
}
