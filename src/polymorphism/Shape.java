package polymorphism;

public class Shape {
	
	public void setColor(){
		redraw();
	}
	

	public void redraw(){
		System.out.println("I am from Shape");
	}
	
	public void testMethod1(){
		System.out.println("I am from Shape11");
		}
	
	protected void xyz() {
		System.out.println("From Shape");
	}
}
