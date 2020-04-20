package assignments.Assignment14_OOP;

public class Question05_TV {

	/*
	 * Write a custom class TV 
	 * that has 4 instance variables: 
int channel=1, int volumeLevel=1, boolean on = false, String brand = "undefined".
	 * Create one "no arguments" constructor that prints message: 
"Creating TV object using no Args- constructor".
	 * Also, create one more constructor that defines the instance variable brand, and displays the message: 
"Creating TV object using 1 arg - constructor".
	 * Generate getters/setters for 
volumeLevel (getVolumeLevel/setVolumeLevel), 
channel (getChannel/setChannel) and 
brand (getBrand/setBrand) instance variables.
	 * Declare methods 
		channelUp() to increase variable channel by one, and 
		channelDown() to decrease variable channel by one.
	* Declare methods 
		volumeUp() to increase variable volume by one, and 
		volumeDown() to decrease variable volume by one.
	* Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
		If the tv is already on, no need to turn it on again, display the message: "TV is already ON". 
		If the tv is already off, then no need to turn it off again, display the message: "TV is already OFF".
	* The value of a variable channel cannot be negative or zero, and cannot be higher than 120. 
	* If the user will try to set an invalid channel, display the message: 
"ERROR: TV is either OFF or invalid Channel".
	* Volume can be only in the range between 1 and 7. 
You may change volume only if TV is on. 
Otherwise, display the message: 
"ERROR: TV is either OFF or invalid Volume level". 
	* Create isOn() method that will check tv status.
	 */
	
	//variables
	private int channel=1;
	private int volumeLevel=1;
	boolean on = false;
	private String brand = "undefined";
	
	//"no arguments" constructor 
	public Question05_TV() {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
		this.brand = brand;
		System.out.println("Creating TV object using no Args- constructor");
	}

	//constructor that defines the instance variable brand
		public Question05_TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	//getters
	public int getChannel() {
		return channel;
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}

	public String getBrand() {
		System.out.println(brand);
		return brand;
	}
	
	//setters
	//Limitation 0<channel<120
	public void setChannel(int channel) {
		this.channel = channel;
		if(channel<0 || channel>120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			System.out.println("Selected channel is : " + channel);
		}
	}
	//Limitation 0<Volume<8. 

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
		if(volumeLevel<1 || volumeLevel>7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}else {
			System.out.println("Selected volume level is : " + volumeLevel);
		}
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("The brand of TV is : " + brand);
	}


	//Methods
	//Method to increase variable channel by one
	public void	channelUp() {
		channel++;
		if(channel>120) {
			System.out.println("ERROR: invalid Channel");
		}else {
			System.out.println("Channel number increased to: " + channel);
		}
	}
	
	//Method to decrease variable channel by one
	public void channelDown() {
		channel--;
		if(channel<0) {
			System.out.println("ERROR:invalid Channel");
		}else {
			System.out.println("Channel number decreased to: " + channel);
		}
	}
	
	//Method to increase variable volume by one
	public void volumeUp() {
		volumeLevel++;
		if(volumeLevel>7) {
			System.out.println("ERROR: invalid Volume level");
		}else{
			System.out.println("Volume level increased to level: " + volumeLevel);
		}
	}
	
	//Method to decrease variable volume by one
	public void volumeDown() {
		volumeLevel--;
		if(volumeLevel<0) {
			System.out.println("ERROR: invalid Volume level");
		}else{
			System.out.println("Volume level decreased to level: " + volumeLevel);
		}
	}
	
	// method that will check tv status.
	public void isOn() {
		if(on=false) {
			System.out.println("TV is Off");
		}else{
			System.out.println("TV is ON");
		}
	}
	
	public void turnOn() {
		if(on=false) {
			on=true;
		}else {
			System.out.println("TV is already ON");
			}
	}	
		
	public void turnOff() {
		if(on=true) {
			on=false;
			System.out.println("TV is turning OFF");
		}else {
			System.out.println("TV is already OFF");
			}
	}
	
	
public static void main(String[] args) {
	
	Question05_TV TV = new Question05_TV("SONY");	//Creating TV object using 1 arg - constructor
	TV.getBrand();
	System.out.println("-----------------");
	Question05_TV TV1 = new Question05_TV();	//Creating TV object using no Args- constructor
	TV1.isOn();									//TV is ON
	System.out.println("-----------------");
	TV1.turnOn();								//TV is already ON
	System.out.println("-----------------");
	TV1.volumeDown();							//Volume level decreased to level: 0
	System.out.println("-----------------");
	TV1.volumeDown();							//ERROR: invalid Volume level
	System.out.println("-----------------");
	TV1.volumeUp();								//Volume level increased to level: 1
	System.out.println("-----------------");
	TV1.channelDown();							//Channel number decreased to: 0
	System.out.println("-----------------");
	TV1.channelUp();							//Channel number increased to: 1
	System.out.println("-----------------");
	TV1.setChannel(75);							//Selected channel is : 75
	System.out.println("-----------------");
	TV1.setChannel(275);						//ERROR: TV is either OFF or invalid Channel
	System.out.println("-----------------");
	TV1.setVolumeLevel(4);						//Selected volume level is : 4
	System.out.println("-----------------");
	TV1.setVolumeLevel(14);						//ERROR: TV is either OFF or invalid Volume level
	System.out.println("-----------------");	
	TV1.setBrand("SAMSUNG");					//The brand of TV is : SAMSUNG
	System.out.println("-----------------");
	TV1.turnOff();								//TV is turning OFF
}					
}
