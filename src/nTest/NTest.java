package nTest;

public class NTest {
	
	
	public void pubMethod() {
		
		System.out.println("I am Public");
	}
	
private void priMethod() {
		
		System.out.println("I am Private");
	}


protected void proMethod() {
	
	System.out.println("I am Protected");
}

 void defMethod() {
	
	System.out.println("I am default");
}
 
 public static void statMethod() {
	 System.out.println("I am Static");
	 
 }
 
 
 public static void main(String args[]) {
		
		NTest obj = new NTest();
		System.out.println(obj);
		 
		
		
	}
}
