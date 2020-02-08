package assignments.Assignment8_Methods;

public class Question15_validateTask {

	public static void main(String[] args) {
		/*
		 * We have a to do list app, every time a user adds a task - a few things needed to be checked.
		 * It should not be empty. boolean parameter needs to be true
		 * taskId should be only 1 greater than currentID. 
		 * for example if we have 7 tasks(currentId is 7) 
		 * so the next task id is 8 , it can't be 10.
for example:

validateTask(true,2,1)
returns true

validateTask(true,3,1)
returns false

validateTask(false,3,2)
returns false
		 */

System.out.println(validateTask(true, 2,1));

System.out.println(validateTask(true, 3,1));

System.out.println(validateTask(true, 3,2));
 
	
/*
 in question 15 you got the logic's right, 
 just put the variables b1, i1 and i2 as method's parameters, 
 and if the condition you wrote is true, 
 the result should be true,
  or just print a message that Validation succeeded. 
 */
	}
	public static boolean validateTask(boolean b1, int i1, int i2) {
		
			if ( b1  && (i1 == i2 + 1)) {
				
				return true;
				
			}else return false;
			
	}

}
