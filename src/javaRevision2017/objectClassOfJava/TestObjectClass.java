package javaRevision2017.objectClassOfJava;

import java.util.HashMap;
import java.util.Map;

public class TestObjectClass implements Cloneable {
	public String x;
	public long id;
	
	
	public TestObjectClass(String x, long id){
		this.x=x;
		this.id=id;
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof TestObjectClass)){
			return false;
		}
		
		if(this == obj){
			return true;
		}
		
		return ((this.x==((TestObjectClass)obj).x) && this.id ==(((TestObjectClass)obj).id) );
	}
	
	public int hashCode(){
		int result =0;
		result=(int) this.id/2;
		return result;
	}

	
	public static void main(String args[]){
		
		TestObjectClass testObj= new TestObjectClass("FIS",100);
		TestObjectClass testObj1= new TestObjectClass("FIS",100);
		System.out.println(testObj.equals(testObj1));
		System.out.println(testObj.equals(null));
		System.out.println(testObj.equals(testObj));
		
		Map map = new HashMap();
		map.put(testObj , "Yash");
		
		
		System.out.println(map.get(testObj));
		System.out.println(map.get(testObj1));
		
		try {
			testObj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
