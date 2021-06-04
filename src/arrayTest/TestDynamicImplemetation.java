package arrayTest;

public class TestDynamicImplemetation {
public static void main (String [] args){
	
	DynamicImplementation dynImp = new DynamicImplementation();
	
	dynImp.setData(4, 10);
	
	System.out.println (dynImp.getData(4));
	System.out.println (dynImp.getData(6));	
}
}
