package generics;

public class MainClass1 {

	
	public static void main(String args[]){
		
		SimpleClass sClass= new SimpleClass();
		
		BaseGeneric<SimpleClass> bClass = new BaseGeneric<SimpleClass>(sClass);
		
		bClass.getObjVal();
		
	}
}
