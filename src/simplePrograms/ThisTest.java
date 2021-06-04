package simplePrograms;

public class ThisTest {
	public static int intStat = 5;
	public static double doubleState = 8.2;
	public  int intNonStat = 6;
	public  double doubleNonState = 9.2;
	public char  charNonStatic;

	public ThisTest(int intValue, double Doublevalue, char charNonStatic){
		intStat = intValue;
		doubleState = Doublevalue;
		charNonStatic = charNonStatic;
	System.out.println("intStat " + intStat);
	System.out.println("doubleState " + doubleState);
	System.out.println("charNonStatic " + charNonStatic);
	}
	public ThisTest(){
		
	System.out.println("intStat " + intStat);
	System.out.println("doubleState " + doubleState);
	System.out.println("charNonStatic " + charNonStatic);
	} 
	 public static void methodStatic(int intStat, double doubleState){
		 
		 intStat = intStat;
		 doubleState = doubleState;
		 
		 System.out.println("intStat " + intStat);
			System.out.println("doubleState " + doubleState);
		 
	 }
	 
	 public void methodNonStatic(int intStat, double doubleState){
		
		 System.out.println("intStat " + intStat);
			System.out.println("doubleState " + doubleState);
	 }
	 public static void main (String [] args){
		 System.out.println(intStat);
		 System.out.println(doubleState);
		 

	
	 }
	 
	 
		 
	 
	 
}
