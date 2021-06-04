package simplePrograms;

public class testClass {

	public static void main (String [] args){
		
		ThisTest testVar = new ThisTest(10, 20.1, 'b');
		System.out.println("intStat " + testVar.intStat);
		System.out.println("doubleState " + testVar.doubleState);
		System.out.println("charNonStatic " + testVar.charNonStatic);
		
		ThisTest testVar1 = new ThisTest();
		System.out.println("intStat " + testVar.intStat);
		System.out.println("doubleState " + testVar.doubleState);
		System.out.println("charNonStatic " + testVar.charNonStatic);
	}
	
}
