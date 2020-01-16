package assignments.Assignment6_ForLoop;

public class Question10_drawPattern {

	public static void main(String[] args) {
		/*Write nested loop to draw this pattern

			##
			# #
			#   #
			#    #
			#     #
			#      #
			#       #		  */

		for (int i =1; i<8;i++) {
			
			System.out.print("#");
			
			for (int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}System.out.println("#");
		}
		
		
		}
		
	
}

