package assignments.Assignment13;

import java.util.ArrayList;

public class Question75_searchString {

	public static void main(String[] args) {
		/*
		 * Search method accepts ArrayList of Strings and  a String to find and returns a String.
		 * It will look for an element within ArrayList that contains the value of the find.
		 * If it finds it, the method needs to return the whole Element value.
		 * If an instance of find doesn't exist return: "search failed"

Sample Output:

    search(["one apple","two orange","four banana"],"four")

      returns:
     "four banana"
     ("four banana" contains "four" so method returns "four banana")

     search(["hello","world"],"goodbye")
     returns:
     "search failed"
     (no "goodbye" in any element)
		 */
		ArrayList <String > inputAL1  = new ArrayList<>();
			inputAL1.add("one apple");
			inputAL1.add("two oranges");
			inputAL1.add("four bananas");
		String inputSearch1 = "four";
		
		
		ArrayList <String > inputAL2  = new ArrayList<>();
			inputAL2.add("hello");
			inputAL2.add("world");
			
		String inputSearch2 = "goodbye";
		
		System.out.println(inputAL1);
		System.out.println(searchString(inputAL1, inputSearch1));
		
		System.out.println(inputAL2);
		System.out.println(searchString(inputAL2, inputSearch2));
		
	}
	public static String searchString(ArrayList <String > AL, String search) {
		
		String result = "0";
		
		for (int i=0;   i< AL.size();   i++) {
			
			if(AL.get(i).contains(search)) {
				
				result = AL.get(i);
			}
			else result = "search failed";	
		}
		return result;	
	}
}
