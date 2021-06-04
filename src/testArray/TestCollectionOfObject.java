package testArray;
import java.util.*;
public class TestCollectionOfObject {

	public static void main(String [] args){
		
		CollectionOfObject co0 = new CollectionOfObject();
		CollectionOfObject1 co1 = new CollectionOfObject1();
		
		ArrayList<CollectionOfObject> al = new ArrayList<CollectionOfObject>();
		al.add(co0);
		//al.add(0, co1);
		//al.remove(0);
		for (Object o1: al){
		    
			System.out.println("Array list value " + o1);
		}
		 
		
	}
	
}
