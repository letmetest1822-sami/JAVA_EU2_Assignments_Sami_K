package assignments.Assignment14_OOP;

public class Question03_Db {

/*
 * In Db class we have two attributes/instance variables with the private visibility.
 * meaning they cannot be accessed outside of the class.

Instance variables:
					1) 	name: data -
						type: String
							Visibility/Access modifier: private
					2) 	name: yint -
						type: int
							Visibility/Access modifier: private

Methods:
		- insertData 	- lets you set the values to above encapsulated instance variables.
		- getData 		- getter method for private data
		- getYint 		- getter method for private yint
		- setData 		- setter method for private data
		- setYint 		- setter method for private yint

for example:
				Db db = new Db();
				db.insertData("aaa",123);

				System.out.println(db.getData());	//aaa
				System.out.println(db.getYint());	//123

				db.setData("zzz");
				db.setYint(200);

				System.out.println(db.getData());	//zzz
				System.out.println(db.getYint());	//200
 */
	//Instance variables:
	private String data;
	private int yint;
	
	//Constructor
	public Question03_Db() {
			
		this.data = data;
		this.yint = yint;
	}
	
	//Method
	public void insertData(String a, int i) {
		data = a;
		yint = i;
		
	}

	//getters (to be able to read private variables)
	public String getData() {
		return data;
	}

	public int getYint() {
		return yint;
	}

	
	//setters (to be able to edit private variables)
	public void setData(String data) {
		this.data = data;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	
	//create a main method to run the code
	public static void main(String[] args) {

		Question03_Db db = new Question03_Db();
		db.insertData("aaa",123);

		System.out.println(db.getData());
		System.out.println(db.getYint());

		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		
		
		

	}

}
