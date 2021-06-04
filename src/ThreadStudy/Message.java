package ThreadStudy;

public class Message{
	
	private String messageVal="";
	
	public Message(String mesVal){
		this.messageVal=mesVal;
	}
	
	
	public String getMessage(){
		return this.messageVal;
	}
	
	public void setMessage(String mesVal){
		this.messageVal=mesVal;
	}
	
	
	
}
