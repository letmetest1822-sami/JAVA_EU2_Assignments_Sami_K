package assignments.Assignment7_NestedForLoop;

public class Question03_NumberSandWatch {

	public static void main(String[] args) {
		/*Write a Java program to print the following pattern

			1 2 3 4 5 6 7
 			 2 3 4 5 6 7
   			  3 4 5 6 7
   			   4 5 6 7
    			5 6 7
     			 6 7
        		  7
     			 6 7
    		    5 6 7
        	   4 5 6 7
  			  3 4 5 6 7
 			 2 3 4 5 6 7
			1 2 3 4 5 6 7
		 	
		 */
	
		 // to form the Upper half
        
        for (int i = 1; i <= 7; i++) {		// use i to form the rows
                        
            for (int j = 1; j < i; j++) {      //Use j to form columns. Create j times spaces before numbers
            
                System.out.print(" ");			// Print j times spaces before numbers. 
            }									//	j is working for both spaces and numbers
            for (int j = i; j <= 7; j++) {     //Start creating numbers, j will keep incrementing from the value it stopped after printing the last space, 
            										//	but now it will print the numbers
                System.out.print(j+" "); 	 //Start Printing numbers and spaces next to it.
            } 
            System.out.println(); 				//go to next line
        } 
         
        //Start forming the Lower half
         
        for (int i = 6; i >= 1; i--){   // same logic and variable working reverse starting from 6
           
            for (int j = 1; j < i; j++) {     //Print j times spaces before numbers
            
                System.out.print(" ");
            }      
                for (int j = i; j <= 7; j++) {   //Print numbers
            
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
	}

}
