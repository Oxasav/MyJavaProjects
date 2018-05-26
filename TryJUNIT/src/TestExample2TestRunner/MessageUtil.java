package TestExample2TestRunner;

public class MessageUtil 
{
	private String message;
	
	//Constructor
	//@param message to be print
	public MessageUtil(String message)
	{
		this.message = message;
	}
	
	//print the message
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}

}
