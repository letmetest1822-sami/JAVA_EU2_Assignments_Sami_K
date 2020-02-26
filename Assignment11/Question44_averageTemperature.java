package assignments.Assignment11;

public class Question44_averageTemperature {

	public static void main(String[] args) {
		/*
		 * Given an array temps of doubles, containing temperature data, compute the average temperature. 

Sample Output:
     input: 80 88 88 84 82 78 60 68
     output: 78.5
		 */
		
		double [] input = {80, 88, 88, 84, 82, 78, 60, 68};
		
		averageTemperature(input); 
	}
	public static void averageTemperature( double []arr) {
		
		double sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}
}
