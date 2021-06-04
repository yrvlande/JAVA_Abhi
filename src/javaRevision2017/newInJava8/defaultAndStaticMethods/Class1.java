package javaRevision2017.newInJava8.defaultAndStaticMethods;

public class Class1 implements Interface1,Interface2{

	@Override
	public int addNumber(int i, int j) {
		return i+j;
		
	}
	
	public static void main(String[] args) {
		
		Interface1 i1 = new Class1();
		i1.addNumber(1, 2);
		
		i1.default1Intf1();
		Interface1.static1Intf1();
	
	}

	@Override
	public int XYZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
