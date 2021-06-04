package arrayTest;

public class TestArray{
	 static int t;
	 //t=10; invalid as assignment statement can only be possible inside the subroutine for instance variable.
 static	int[] a;
 
 
 TestArray c = new TestArray();

static public void testMethod(){
	 
	 
	int[] d;
	d= new int[4];
	a = new int[5];
	System.out.println(a[4]);
}

	public static void main(String [] args){ 
	
		TestArray.testMethod();
		
		
		
		System.out.println(a);
	}
}
