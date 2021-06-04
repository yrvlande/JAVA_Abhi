package simplePrograms;

public class Account {
public int a;
public int b;
Account a1 ;
public void setData(int a, int b) {
	a = a;
	this.b = b;
	System.out.println("Value of A " +a);
	System.out.println("Value of B " +b);
	
}

public void showData (){
	System.out.println("Value of A " +a);
	System.out.println("Value of B " +b);
	System.out.println(this);
  
	}
 public static void testMethod(){
	 System.out.println(" I am static");
		
 }
 
 public void testMethod1(Account D){
	 System.out.println(" I am non static");
	 
	 
 }
 





public static void main (String [] args){
	Account obj1 = new Account();
	obj1.setData(5, 6);
	
	obj1.showData();
	Account obj2 = new Account();
	
	obj1.testMethod1(obj2);
}
	
}
