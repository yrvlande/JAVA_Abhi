package exceptionTest.exceptionRevision17;

public class UncheckedException extends RuntimeException {
private String message;
	public UncheckedException() {
	   super();
	}
	
	public UncheckedException(String message){
		
		super(message);
		this.message = message;
	}
	
	
	
	
}
