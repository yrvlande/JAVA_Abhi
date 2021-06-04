package polymorphism;

public class Oval extends Shape {
	public void redraw(){
		System.out.println("I am from Oval");
}
	
	@Override
	public void xyz() {
		System.out.println("From Oval");
	}
}
