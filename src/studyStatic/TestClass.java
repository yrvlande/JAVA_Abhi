package studyStatic;
/**
 * Test Class for Static verification
 * @author Yashwant.Lande
 *
 */
public class TestClass {
public static void main (String [] args){
/*
 * Let call the Only Class first,
 *	
 */
	System.out.println(BaseClass.addInt(1, 2));
/*
 * Let create the object with constructor having formal parameter	
 */
	BaseClass obj1 = new BaseClass(10, 20);	
	System.out.println("Value of variable i " + obj1.i);
	System.out.println("Value of variable j " + obj1.j);
	
	/*
	 * Let create the object with constructor having no formal parameter 	
	 */
	
	BaseClass obj2 = new BaseClass();
	System.out.println("Value of variable i " + obj2.i); //Point to static location of variable i, And increament it
	System.out.println("Value of variable j " + obj2.j); // Reinitialize the non static variable j and then increament it\
	
	System.out.println(obj2.multiplyInt(4,5));
	System.out.println(obj2.addInt(2, 3));
	
	
}
}
