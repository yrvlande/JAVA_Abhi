package studyInterface;

public class testClass {
public static void main (String [] args){
	
	class2 c = new class2();

	Interface2 i2 = new class2();
      i2.studyMethod2();
         
	Interface1 i1= (Interface1)i2;
	i1.studyMethod1();
}
	
	
}
