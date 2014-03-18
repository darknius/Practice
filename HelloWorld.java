/*This program will display the hello world message and a good morning message.
 *It will say hello to a character and then display a message relating to the character.
 */

public class HelloWorld {
	
	// Instantiating class variables
	private String myString;
	private String myStringTwo;
	String name;

	//Main method below
	public static void main(String[] args){
		HelloWorld myMessage = new HelloWorld("Hello World!", "Good morning to all.");
		myMessage.displayMessage();
		myMessage.setName("Mickey Mouse");
		myMessage.printName();
		System.out.print("What a wonderful day at Disneyland.");
				
	}
	
	//HelloWorld constructor with 2 string parameters
	public HelloWorld(String helloMessage, String msgTwo){
		myString = helloMessage;
		myStringTwo = msgTwo;
	}
	
	//Method to set the name
	public void setName(String name){
		this.name = name;
	}
	
	//Method to print name
	public void printName(){
		System.out.println("Hello " + name +",");
	}
	
	//Method to display my message
	public void displayMessage(){
		System.out.print(myString + " ");
		System.out.println(myStringTwo);
	}
}
