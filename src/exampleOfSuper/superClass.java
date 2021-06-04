package exampleOfSuper;

public class superClass {
   public int x;
   public int y;
//   public superClass(){
//	 this(1);
//	   System.out.println("I am constructor with no parameter");
//	   x = 10;
//	   y = 11;
//	   
//   }
   
   public superClass(int a){
	   System.out.println("I am constructor with parameter");
	   x = 12;
	   y = 13;
	     }
   public void methodOne(){
	   System.out.println("I am Super MethodOne");
	   
   }

   public void methodTwo(){
	   System.out.println("I am Super MethodTwo");
   }
}
