package innerClass;

public class MainClass {
       public int mainClassVar;
       
       public MainClass (int a){
    	   mainClassVar++;
    	   
       }

       public MainClass (){
    	   }
       
	public void mainClassMethod(){
		System.out.println("From Main Class");
		
		InnerClass innerClassObject = new InnerClass();
		innerClassObject.innerClassMethod();
		}
         //Inner Class
	public class InnerClass{
		public int innerClassVar;
		public void innerClassMethod(){
			System.out.println("From Inner Class");
			
			
		}
	}
	
	public static void main(String [] args){
		MainClass mainClassObject = new MainClass(1);
		
		mainClassObject.mainClassMethod();
		
	}
}
