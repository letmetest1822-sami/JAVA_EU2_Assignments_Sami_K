package assignments.Assignment13;

import java.util.ArrayList;

public class Question74_removeInstance {

	public static void main(String[] args) {
		/*This method gets an arraylist of Integers and a number(Integer).it returns an arraylist. It removes any instance of the number it gets from the arraylist.

Sample Output:

     romoveInst([1,1,2,3,1,4],1)
     returns: [2,3,4]

     romoveInst([3,4,3,3],4)
     returns: [3,3,3]
     */
		ArrayList<Integer> input1 = new ArrayList<>();
			input1.add(1);
			input1.add(1);
			input1.add(2);
			input1.add(3);
			input1.add(1);
			input1.add(4);
		int removeNumber1 = 1;
		
		
		ArrayList<Integer> input2 = new ArrayList<>();
			input2.add(3);
			input2.add(4);
			input2.add(3);
			input2.add(3);
		int removeNumber2 = 4;
		
		
		System.out.println(input1);
		System.out.println(removeInstance(input1,removeNumber1));
		
		System.out.println("*****");
		
		System.out.println(input2);
		System.out.println(removeInstance(input2,removeNumber2));
		
	}
	public static ArrayList<Integer> removeInstance(ArrayList<Integer> AL, int remove){
		
		for (int i = 0;     i<AL.size();    i++) {
			
			if (AL.get(i) == remove) {
				
				AL.remove(i);
				
				i--;	
			}
		}
		return AL;
	}
}
