package simplePrograms;
/**This is my first Class i am calling simple static method. And its called from Main() routine.
No class instance created i.e Object*/

public class SimpleStaticMetiod{

public static void main(String[] arg){

	simpleCalculation(10,20);
	System.out.println("Class Over");
	simpleCalculation1();
	
}

static void simpleCalculation(int a, int b){
	int c = a + b;
    System.out.println("The Addition is " + c);
     }

static int simpleCalculation1(){
	int a = 10;
	return a;

}
}