package exceptionTest;

import java.io.IOException;

public class testException {
 
	public static void main (String [] args){
		
		ExceptionTest testException = new ExceptionTest();
		testException.testArithmetic();
		try {
		testException.testIOException();
		}
		catch (IOException e){
			System.out.println(e.getStackTrace());
		}
	}
	
	
	
	
}
