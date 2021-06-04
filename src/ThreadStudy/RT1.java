package ThreadStudy;

public class RT1 implements Runnable {

	@Override
	public void run() {
		System.out.println("The name of Thread is " +Thread.currentThread().getName()+ " on" + System.currentTimeMillis());
		testMethod(4,5);
	  }
	
	
	public void testMethod(int a, int b){
		int c;
	    c=a+b;
		
	System.out.println("I am Addition From Class RT1----" +c );
	}
}
