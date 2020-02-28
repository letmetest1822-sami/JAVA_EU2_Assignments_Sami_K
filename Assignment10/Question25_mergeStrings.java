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

    mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */

		String s1 ="12345";
		String s2 ="abcde";
		
		mergeStrings(s1,s2);
		mergeStrings("wooden", "spoon");
		mergeStrings("java", "selenium");
	}

	public static void mergeStrings(String word1,String word2) {
		
		int small =0;
				
		if (word1.length()>=word2.length()){
			small = word2.length();
		}
		else if (word2.length()>word1.length()){
			small = word1.length();}
		String merged = "";
		
			
				
			for (int i = 0; i<small; i++){
				merged += word1.substring(i, i+1) + word2.substring(i, i+1);
					
			}
			if ( word2.length() > word1.length() ){
					
				merged +=  word2.substring(word1.length(), word2.length());
			}
			else if ( word1.length() > word2.length() ){
					
				merged +=  word1.substring(word2.length(), word1.length());
			}
			System.out.println(merged);
	}
}

