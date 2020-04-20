package assignments.Assignment14_OOP;

public class Question04_Person {

/*
 * Person class has following attributes:
		- private String instance variables: firstName, lastName
		- private int instance variable: age

 * Methods:
	- getter and setter methods for each instance variable. try to use this. keyword
	- toString method.No parameters and Returns
	  (does not print! no println in the method!) 
	  person info in this format:                      "firstName | lastName | age"

 * Constructors:

	1) No-Args constructor
			-sets default values for the Person object
				name and lastName => "undefined"
				age => -1

	2) 3-Args Constructor:
			- accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
				try to use this. keyword

Examples:

	Person person = new Person();

		System.out.println(person.getFirstName()); //"undefined"
		System.out.println(person.getLastName()); //"undefined"
		System.out.println(person.getAge()); // -1
		System.out.println(person.toString()); //"undefined | undefined | -1"

person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);

System.out.println(person.toString() ); // "John | Doe | 44"

Person person = new Person("Fatima", "Lee", 22);

System.out.println(person.getFirstName()); //"Fatima"
System.out.println(person.getLastName()); //"Lee"
System.out.println(person.getAge()); // 22
System.out.println(person.toString()); //"Fatima | Lee | 22"	
 */
	
	
		
	//variables
	private String firstName;
	private String lastName;
	private int age;
		
	//getters (to be able to read private variables)
	public String getFirstName() {
			return firstName;
		}
	
	public String getLastName() {
			return lastName;
		}
	
	public int getAge() {
			return age;
		}
	
	//setters (to be able to edit private variables)
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString method
	//"firstName | lastName | age"
	@Override
	public String toString() {
		return "firstName  : " + firstName + ", lastName : " + lastName + ", age : " + age;
	}

	//constructors
	//1.Create No-Args constructor to sets default values for the Person object
	public Question04_Person() {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//2. Create 3-Args Constructor accepts and assigns values to encapsulated instance variables

	public Question04_Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	
	

	//create a main method to run the code
	public static void main(String[] args) {
		
		Question04_Person person1 = new Question04_Person();

		System.out.println(person1.getFirstName()); //"undefined"
		System.out.println(person1.getLastName()); //"undefined"
		System.out.println(person1.getAge()); // -1

		System.out.println(person1.toString()); //"undefined | undefined | -1"
		
System.out.println("+---------------------------------------+");
		//assign new values to private variables via setters
		person1.setFirstName("John");
		person1.setLastName("Doe");
		person1.setAge(44);

		System.out.println(person1.toString() ); // "John | Doe | 44"
		
System.out.println("+---------------------------------------+");
		Question04_Person person2 = new Question04_Person("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); //"Fatima"
		System.out.println(person2.getLastName()); //"Lee"
		System.out.println(person2.getAge()); // 22
		System.out.println(person2.toString()); //"Fatima | Lee | 22"	
		
	}
}
