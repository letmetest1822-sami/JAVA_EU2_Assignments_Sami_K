package assignments.Assignment10;

public class Question25_mergeStrings {

	public static void main(String[] args) {
		/*
		 * When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. 
Please note one and two can be of different lengths. 
Please look at below examples:

     		s1 	==> "12345"
     		s2 	==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

    mergeStrings("wooden", "spoon") ==> "jsaevlaenium"
		 */

		String s1 ="12345";
		String s2 ="abcde";
		
		mergeStrings(s1,s2);
		//mergeStrings("wooden", "spoon");
		//mergeStrings("wooden", "spoon");
	}

	public static void mergeStrings(String word1,String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		
		String merged = "";
		
		for (int i = 0; i<len1+len2; i++){
			
			if((i<=len1)&&(i<=len2)){
			merged += word1.charAt(i) + word2.charAt(i);
			}
		}
		System.out.println(merged);
	}
}
