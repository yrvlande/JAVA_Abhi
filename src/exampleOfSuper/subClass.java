package exampleOfSuper;

public class subClass extends superClass {
	public int x = 1;
	   public int y;
	   
	   public subClass(int a){
		   super(1);
		    System.out.println("VAlue of x " +super.x);   
		  
	   }
	
	   
	   public void methodOne(){
		   System.out.println("I am sub MethodOne");
		   System.out.println(super.x);
	   }

	   public void methodTwo(){
		   System.out.println("I am sub MethodTwo");
		   super.methodOne();
	   }
	   
	   public static void main (String [] args){
		   
		   subClass obj1 = new subClass(2);
		   
		   obj1.methodOne();
		   obj1.methodTwo();
	   }
}
