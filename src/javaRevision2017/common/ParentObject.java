package javaRevision2017.common;

public class ParentObject implements Cloneable{

	public int x;
	
	
	public static void main(String args[]){
		
		ParentObject p1 = new ParentObject();
		System.out.println(p1);
		System.out.println(p1.x=10);
		System.out.println(p1.getClass());
		System.out.println(p1.toString());
		
		try {
			
			ParentObject o1 =(ParentObject) p1.clone();
			System.out.println(o1.x);
			boolean z = p1==o1;
			System.out.println(z);
			System.out.println(p1.equals(o1));
			System.out.println(p1.clone().equals(p1));
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		

		
	}
	public String toString() {
		return "I am P";
	}
	
	
	
}
