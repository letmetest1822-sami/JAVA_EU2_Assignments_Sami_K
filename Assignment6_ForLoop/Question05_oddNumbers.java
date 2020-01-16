package assignments.Assignment6_ForLoop;

public class Question05_oddNumbers {

	public static void main(String[] args) {
		/* Write a program for the following logic:
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
		if end = 10, OUTPUT = 1, 3, 5, 7, 9
		if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

		* You should use while loop and if-else statements.
		* Note that, there should not be any comma after the last digit.*/

		int i=1,    end=11;
		
		while (i<=end) {
			
			if (i%2!=0){
				System.out.print(i);
				
				if ((i!=end)&&(i!=(end-1))) {
					System.out.print(", ");
					
				}else{
					
				System.out.print(" ");}
				}
				
			i++;
					
		/*for (i=1;    i<=end;   i++) {
			
			if (i==end) {
				System.out.print(i);
				break;
			}
			if (i%2!=0){
				System.out.print(i + ", ");
			}*/
		}

	}
}
