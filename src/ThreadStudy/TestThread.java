package ThreadStudy;

public class TestThread {

	public static void main (String[] args){
		
		Runnable r = new RT1();
		Thread newThread= new Thread(r,"ThreadYashwant");
		newThread.start();
		
		System.out.println("Back To Main");
		
		
	}
	
}
