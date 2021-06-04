package polymorphism;

public class Test {
public static void main(String [] args){
	Shape s = new Rectangle();
	s.setColor();
	Shape s1 = new Oval();
	s1.setColor();
	Shape s2 = new Shape();
	s2.setColor();
	s.testMethod1();
	
	
	Shape s3 = new Shape();
	
	

}
}
