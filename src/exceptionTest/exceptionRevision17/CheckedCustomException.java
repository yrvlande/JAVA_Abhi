package exceptionTest.exceptionRevision17;


public class CheckedCustomException extends Exception{
private String message = null;
	public CheckedCustomException(){
		super();
	}
	
	public CheckedCustomException(String message){
		super(message);
		this.message= message;
	}
	
	public CheckedCustomException(Throwable cause){
		
		super(cause);
	}

//	public String toString(){
//		return "FIS Exception";
//	}
//	

}
